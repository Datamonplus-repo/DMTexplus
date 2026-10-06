package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.datospedidoproveedor", "/app.datospedidoproveedor"})
@jakarta.servlet.annotation.MultipartConfig
public final  class datospedidoproveedor extends GXWebObjectStub
{
   public datospedidoproveedor( )
   {
   }

   public datospedidoproveedor( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( datospedidoproveedor.class ));
   }

   public datospedidoproveedor( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new datospedidoproveedor_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new datospedidoproveedor_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Datos Pedido Proveedor";
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

