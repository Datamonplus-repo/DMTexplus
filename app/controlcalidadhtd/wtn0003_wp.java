package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.wtn0003_wp", "/app.controlcalidadhtd.wtn0003_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wtn0003_wp extends GXWebObjectStub
{
   public wtn0003_wp( )
   {
   }

   public wtn0003_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wtn0003_wp.class ));
   }

   public wtn0003_wp( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wtn0003_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wtn0003_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consulta Datos CC";
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

