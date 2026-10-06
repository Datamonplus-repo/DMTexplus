package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.precios_cliente_wp", "/app.facturacion.precios_cliente_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class precios_cliente_wp extends GXWebObjectStub
{
   public precios_cliente_wp( )
   {
   }

   public precios_cliente_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( precios_cliente_wp.class ));
   }

   public precios_cliente_wp( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new precios_cliente_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new precios_cliente_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Precios por cliente";
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

