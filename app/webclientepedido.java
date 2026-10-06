package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webclientepedido", "/app.webclientepedido"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webclientepedido extends GXWebObjectStub
{
   public webclientepedido( )
   {
   }

   public webclientepedido( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webclientepedido.class ));
   }

   public webclientepedido( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webclientepedido_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webclientepedido_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web Cliente Pedido";
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

