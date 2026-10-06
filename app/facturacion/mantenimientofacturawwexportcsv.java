package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.mantenimientofacturawwexportcsv", "/app.facturacion.mantenimientofacturawwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mantenimientofacturawwexportcsv extends GXWebObjectStub
{
   public mantenimientofacturawwexportcsv( )
   {
   }

   public mantenimientofacturawwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mantenimientofacturawwexportcsv.class ));
   }

   public mantenimientofacturawwexportcsv( int remoteHandle ,
                                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mantenimientofacturawwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mantenimientofacturawwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento Factura WWExport CSV";
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

