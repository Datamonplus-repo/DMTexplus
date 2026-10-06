package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webdatospedido", "/app.webdatospedido"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webdatospedido extends GXWebObjectStub
{
   public webdatospedido( )
   {
   }

   public webdatospedido( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webdatospedido.class ));
   }

   public webdatospedido( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webdatospedido_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webdatospedido_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web Datos Pedido";
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

