package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.informeproduccionresumenturnodp_wc", "/app.produccion.informeproduccionresumenturnodp_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informeproduccionresumenturnodp_wc extends GXWebObjectStub
{
   public informeproduccionresumenturnodp_wc( )
   {
   }

   public informeproduccionresumenturnodp_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informeproduccionresumenturnodp_wc.class ));
   }

   public informeproduccionresumenturnodp_wc( int remoteHandle ,
                                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informeproduccionresumenturnodp_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informeproduccionresumenturnodp_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Produccion Resumen Turno";
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

