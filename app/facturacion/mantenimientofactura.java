package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.mantenimientofactura", "/app.facturacion.mantenimientofactura"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mantenimientofactura extends GXWebObjectStub
{
   public mantenimientofactura( )
   {
   }

   public mantenimientofactura( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mantenimientofactura.class ));
   }

   public mantenimientofactura( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mantenimientofactura_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mantenimientofactura_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento Factura";
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

