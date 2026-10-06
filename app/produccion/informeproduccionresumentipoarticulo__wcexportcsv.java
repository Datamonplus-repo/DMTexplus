package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.informeproduccionresumentipoarticulo__wcexportcsv", "/app.produccion.informeproduccionresumentipoarticulo__wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informeproduccionresumentipoarticulo__wcexportcsv extends GXWebObjectStub
{
   public informeproduccionresumentipoarticulo__wcexportcsv( )
   {
   }

   public informeproduccionresumentipoarticulo__wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informeproduccionresumentipoarticulo__wcexportcsv.class ));
   }

   public informeproduccionresumentipoarticulo__wcexportcsv( int remoteHandle ,
                                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informeproduccionresumentipoarticulo__wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informeproduccionresumentipoarticulo__wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Produccion Resumen Tipo Articulo__WCExport CSV";
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

