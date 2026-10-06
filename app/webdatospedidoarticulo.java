package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webdatospedidoarticulo", "/app.webdatospedidoarticulo"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webdatospedidoarticulo extends GXWebObjectStub
{
   public webdatospedidoarticulo( )
   {
   }

   public webdatospedidoarticulo( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webdatospedidoarticulo.class ));
   }

   public webdatospedidoarticulo( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webdatospedidoarticulo_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webdatospedidoarticulo_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web Datos Pedido Articulo";
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

