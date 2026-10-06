package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.informeproduccionresumentipoarticulodp_wc", "/app.produccion.informeproduccionresumentipoarticulodp_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informeproduccionresumentipoarticulodp_wc extends GXWebObjectStub
{
   public informeproduccionresumentipoarticulodp_wc( )
   {
   }

   public informeproduccionresumentipoarticulodp_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informeproduccionresumentipoarticulodp_wc.class ));
   }

   public informeproduccionresumentipoarticulodp_wc( int remoteHandle ,
                                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informeproduccionresumentipoarticulodp_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informeproduccionresumentipoarticulodp_wc_impl(context).cleanup();
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

