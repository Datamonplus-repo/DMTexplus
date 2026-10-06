package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.impresionfactura_wp", "/app.facturacion.impresionfactura_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class impresionfactura_wp extends GXWebObjectStub
{
   public impresionfactura_wp( )
   {
   }

   public impresionfactura_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( impresionfactura_wp.class ));
   }

   public impresionfactura_wp( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new impresionfactura_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new impresionfactura_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Impresion Factura";
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

