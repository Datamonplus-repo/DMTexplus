package app.comprasquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.comprasquimicos.tpedido", "/app.comprasquimicos.tpedido"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpedido extends GXWebObjectStub
{
   public tpedido( )
   {
   }

   public tpedido( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpedido.class ));
   }

   public tpedido( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpedido_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpedido_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Pedido Proveedor";
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

