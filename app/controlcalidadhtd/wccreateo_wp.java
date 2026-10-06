package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.wccreateo_wp", "/app.controlcalidadhtd.wccreateo_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wccreateo_wp extends GXWebObjectStub
{
   public wccreateo_wp( )
   {
   }

   public wccreateo_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wccreateo_wp.class ));
   }

   public wccreateo_wp( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wccreateo_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wccreateo_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Comparación Real / Teórico";
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

