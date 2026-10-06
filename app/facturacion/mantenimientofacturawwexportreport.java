package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.mantenimientofacturawwexportreport", "/app.facturacion.mantenimientofacturawwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mantenimientofacturawwexportreport extends GXWebObjectStub
{
   public mantenimientofacturawwexportreport( )
   {
   }

   public mantenimientofacturawwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mantenimientofacturawwexportreport.class ));
   }

   public mantenimientofacturawwexportreport( int remoteHandle ,
                                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mantenimientofacturawwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mantenimientofacturawwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento Factura WWExport Report";
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

