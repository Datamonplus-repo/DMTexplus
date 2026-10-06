package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.informeproduccionresumendatatimedetalle_wcexportcsv", "/app.produccion.informeproduccionresumendatatimedetalle_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informeproduccionresumendatatimedetalle_wcexportcsv extends GXWebObjectStub
{
   public informeproduccionresumendatatimedetalle_wcexportcsv( )
   {
   }

   public informeproduccionresumendatatimedetalle_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informeproduccionresumendatatimedetalle_wcexportcsv.class ));
   }

   public informeproduccionresumendatatimedetalle_wcexportcsv( int remoteHandle ,
                                                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informeproduccionresumendatatimedetalle_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informeproduccionresumendatatimedetalle_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Produccion Resumen Data Time Detalle_WCExport CSV";
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

