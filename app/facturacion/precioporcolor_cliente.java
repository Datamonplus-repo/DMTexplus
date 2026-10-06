package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.precioporcolor_cliente", "/app.facturacion.precioporcolor_cliente"})
@jakarta.servlet.annotation.MultipartConfig
public final  class precioporcolor_cliente extends GXWebObjectStub
{
   public precioporcolor_cliente( )
   {
   }

   public precioporcolor_cliente( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( precioporcolor_cliente.class ));
   }

   public precioporcolor_cliente( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new precioporcolor_cliente_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new precioporcolor_cliente_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Precio por Color (Cliente)";
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

