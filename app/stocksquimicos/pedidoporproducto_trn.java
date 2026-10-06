package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.pedidoporproducto_trn", "/app.stocksquimicos.pedidoporproducto_trn"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pedidoporproducto_trn extends GXWebObjectStub
{
   public pedidoporproducto_trn( )
   {
   }

   public pedidoporproducto_trn( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pedidoporproducto_trn.class ));
   }

   public pedidoporproducto_trn( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pedidoporproducto_trn_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pedidoporproducto_trn_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Pedido por Producto";
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

