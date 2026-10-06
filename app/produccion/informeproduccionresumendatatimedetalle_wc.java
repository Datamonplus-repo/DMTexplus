package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.informeproduccionresumendatatimedetalle_wc", "/app.produccion.informeproduccionresumendatatimedetalle_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informeproduccionresumendatatimedetalle_wc extends GXWebObjectStub
{
   public informeproduccionresumendatatimedetalle_wc( )
   {
   }

   public informeproduccionresumendatatimedetalle_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informeproduccionresumendatatimedetalle_wc.class ));
   }

   public informeproduccionresumendatatimedetalle_wc( int remoteHandle ,
                                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informeproduccionresumendatatimedetalle_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informeproduccionresumendatatimedetalle_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Produccion Resumen Data Time Detalle ";
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

