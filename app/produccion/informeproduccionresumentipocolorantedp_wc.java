package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.informeproduccionresumentipocolorantedp_wc", "/app.produccion.informeproduccionresumentipocolorantedp_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informeproduccionresumentipocolorantedp_wc extends GXWebObjectStub
{
   public informeproduccionresumentipocolorantedp_wc( )
   {
   }

   public informeproduccionresumentipocolorantedp_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informeproduccionresumentipocolorantedp_wc.class ));
   }

   public informeproduccionresumentipocolorantedp_wc( int remoteHandle ,
                                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informeproduccionresumentipocolorantedp_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informeproduccionresumentipocolorantedp_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Produccion Resumen Tipo Colorante";
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

