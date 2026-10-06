package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.controlrecuento_wp", "/app.stocksquimicos.controlrecuento_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class controlrecuento_wp extends GXWebObjectStub
{
   public controlrecuento_wp( )
   {
   }

   public controlrecuento_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( controlrecuento_wp.class ));
   }

   public controlrecuento_wp( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new controlrecuento_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new controlrecuento_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Control Recuento (Inventario)";
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

