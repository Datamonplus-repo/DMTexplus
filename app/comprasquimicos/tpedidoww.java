package app.comprasquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.comprasquimicos.tpedidoww", "/app.comprasquimicos.tpedidoww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpedidoww extends GXWebObjectStub
{
   public tpedidoww( )
   {
   }

   public tpedidoww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpedidoww.class ));
   }

   public tpedidoww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpedidoww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpedidoww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Pedidos Proveedor";
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

