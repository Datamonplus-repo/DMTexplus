package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webdatospedidocolor", "/app.webdatospedidocolor"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webdatospedidocolor extends GXWebObjectStub
{
   public webdatospedidocolor( )
   {
   }

   public webdatospedidocolor( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webdatospedidocolor.class ));
   }

   public webdatospedidocolor( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webdatospedidocolor_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webdatospedidocolor_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " LLAMADA DESDE WKP";
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

