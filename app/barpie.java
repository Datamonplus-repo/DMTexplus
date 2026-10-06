package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.barpie", "/app.barpie"})
@jakarta.servlet.annotation.MultipartConfig
public final  class barpie extends GXWebObjectStub
{
   public barpie( )
   {
   }

   public barpie( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( barpie.class ));
   }

   public barpie( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new barpie_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new barpie_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla BARPIE";
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

