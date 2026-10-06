package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webdatospedidofases", "/app.webdatospedidofases"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webdatospedidofases extends GXWebObjectStub
{
   public webdatospedidofases( )
   {
   }

   public webdatospedidofases( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webdatospedidofases.class ));
   }

   public webdatospedidofases( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webdatospedidofases_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webdatospedidofases_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web Datos Pedido Fases";
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

