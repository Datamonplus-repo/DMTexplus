package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ingenieria.menvww", "/app.ingenieria.menvww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class menvww extends GXWebObjectStub
{
   public menvww( )
   {
   }

   public menvww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( menvww.class ));
   }

   public menvww( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new menvww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new menvww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Envíos de parámetros de máquinas";
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

