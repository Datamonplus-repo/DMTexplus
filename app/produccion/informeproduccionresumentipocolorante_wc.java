package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.informeproduccionresumentipocolorante_wc", "/app.produccion.informeproduccionresumentipocolorante_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informeproduccionresumentipocolorante_wc extends GXWebObjectStub
{
   public informeproduccionresumentipocolorante_wc( )
   {
   }

   public informeproduccionresumentipocolorante_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informeproduccionresumentipocolorante_wc.class ));
   }

   public informeproduccionresumentipocolorante_wc( int remoteHandle ,
                                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informeproduccionresumentipocolorante_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informeproduccionresumentipocolorante_wc_impl(context).cleanup();
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

