package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.informeproduccionresumentipoarticulo_wc", "/app.produccion.informeproduccionresumentipoarticulo_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informeproduccionresumentipoarticulo_wc extends GXWebObjectStub
{
   public informeproduccionresumentipoarticulo_wc( )
   {
   }

   public informeproduccionresumentipoarticulo_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informeproduccionresumentipoarticulo_wc.class ));
   }

   public informeproduccionresumentipoarticulo_wc( int remoteHandle ,
                                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informeproduccionresumentipoarticulo_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informeproduccionresumentipoarticulo_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Produccion Resumen Tipo Articulo";
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

