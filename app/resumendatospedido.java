package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.resumendatospedido", "/app.resumendatospedido"})
@jakarta.servlet.annotation.MultipartConfig
public final  class resumendatospedido extends GXWebObjectStub
{
   public resumendatospedido( )
   {
   }

   public resumendatospedido( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( resumendatospedido.class ));
   }

   public resumendatospedido( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new resumendatospedido_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new resumendatospedido_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Resumen Datos Pedido";
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

