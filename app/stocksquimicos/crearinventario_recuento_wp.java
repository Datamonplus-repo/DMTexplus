package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.crearinventario_recuento_wp", "/app.stocksquimicos.crearinventario_recuento_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class crearinventario_recuento_wp extends GXWebObjectStub
{
   public crearinventario_recuento_wp( )
   {
   }

   public crearinventario_recuento_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( crearinventario_recuento_wp.class ));
   }

   public crearinventario_recuento_wp( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new crearinventario_recuento_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new crearinventario_recuento_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Crear Inventario (recuento)";
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

