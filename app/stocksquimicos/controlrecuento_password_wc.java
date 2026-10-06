package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.controlrecuento_password_wc", "/app.stocksquimicos.controlrecuento_password_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class controlrecuento_password_wc extends GXWebObjectStub
{
   public controlrecuento_password_wc( )
   {
   }

   public controlrecuento_password_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( controlrecuento_password_wc.class ));
   }

   public controlrecuento_password_wc( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new controlrecuento_password_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new controlrecuento_password_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Control Recuento (Password)";
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

