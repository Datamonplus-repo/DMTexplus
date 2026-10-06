package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.informeproduccionresumenhdrdp_wc", "/app.produccion.informeproduccionresumenhdrdp_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informeproduccionresumenhdrdp_wc extends GXWebObjectStub
{
   public informeproduccionresumenhdrdp_wc( )
   {
   }

   public informeproduccionresumenhdrdp_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informeproduccionresumenhdrdp_wc.class ));
   }

   public informeproduccionresumenhdrdp_wc( int remoteHandle ,
                                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informeproduccionresumenhdrdp_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informeproduccionresumenhdrdp_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Produccion Resumen Hdr";
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

