package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.devoluciondeproductosmto_wp", "/app.stocksquimicos.devoluciondeproductosmto_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class devoluciondeproductosmto_wp extends GXWebObjectStub
{
   public devoluciondeproductosmto_wp( )
   {
   }

   public devoluciondeproductosmto_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( devoluciondeproductosmto_wp.class ));
   }

   public devoluciondeproductosmto_wp( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new devoluciondeproductosmto_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new devoluciondeproductosmto_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Devolucion de Productos (Mantenimiento)";
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

