package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.pedidoporproducto_wp", "/app.stocksquimicos.pedidoporproducto_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pedidoporproducto_wp extends GXWebObjectStub
{
   public pedidoporproducto_wp( )
   {
   }

   public pedidoporproducto_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pedidoporproducto_wp.class ));
   }

   public pedidoporproducto_wp( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pedidoporproducto_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pedidoporproducto_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Pedido por Producto";
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

