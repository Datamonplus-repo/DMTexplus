package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.informeproduccionresumen_detallehdrs_wc", "/app.produccion.informeproduccionresumen_detallehdrs_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informeproduccionresumen_detallehdrs_wc extends GXWebObjectStub
{
   public informeproduccionresumen_detallehdrs_wc( )
   {
   }

   public informeproduccionresumen_detallehdrs_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informeproduccionresumen_detallehdrs_wc.class ));
   }

   public informeproduccionresumen_detallehdrs_wc( int remoteHandle ,
                                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informeproduccionresumen_detallehdrs_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informeproduccionresumen_detallehdrs_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Produccion Resumen (Detalle Hdrs)";
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

