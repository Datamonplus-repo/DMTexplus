package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidosclientesindetalle.pedido", "/app.pedidosclientesindetalle.pedido"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pedido extends GXWebObjectStub
{
   public pedido( )
   {
   }

   public pedido( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pedido.class ));
   }

   public pedido( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pedido_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pedido_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Pedido";
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

