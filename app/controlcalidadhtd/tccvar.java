package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.tccvar", "/app.controlcalidadhtd.tccvar"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tccvar extends GXWebObjectStub
{
   public tccvar( )
   {
   }

   public tccvar( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tccvar.class ));
   }

   public tccvar( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tccvar_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tccvar_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Variables Automáticas";
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

