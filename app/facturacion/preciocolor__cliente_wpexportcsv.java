package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.preciocolor__cliente_wpexportcsv", "/app.facturacion.preciocolor__cliente_wpexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class preciocolor__cliente_wpexportcsv extends GXWebObjectStub
{
   public preciocolor__cliente_wpexportcsv( )
   {
   }

   public preciocolor__cliente_wpexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( preciocolor__cliente_wpexportcsv.class ));
   }

   public preciocolor__cliente_wpexportcsv( int remoteHandle ,
                                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new preciocolor__cliente_wpexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new preciocolor__cliente_wpexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Precio Color__Cliente_WPExport CSV";
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

