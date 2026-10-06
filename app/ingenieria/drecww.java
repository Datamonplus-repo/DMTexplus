package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ingenieria.drecww", "/app.ingenieria.drecww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class drecww extends GXWebObjectStub
{
   public drecww( )
   {
   }

   public drecww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( drecww.class ));
   }

   public drecww( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new drecww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new drecww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Data Recepcion Enlace c/PLC";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

