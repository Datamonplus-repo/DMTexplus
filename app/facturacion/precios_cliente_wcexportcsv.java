package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.precios_cliente_wcexportcsv", "/app.facturacion.precios_cliente_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class precios_cliente_wcexportcsv extends GXWebObjectStub
{
   public precios_cliente_wcexportcsv( )
   {
   }

   public precios_cliente_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( precios_cliente_wcexportcsv.class ));
   }

   public precios_cliente_wcexportcsv( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new precios_cliente_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new precios_cliente_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Precios_cliente_WCExport CSV";
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

