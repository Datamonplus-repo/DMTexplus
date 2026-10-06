package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.informeproduccionresumenoperariodp_wc", "/app.produccion.informeproduccionresumenoperariodp_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informeproduccionresumenoperariodp_wc extends GXWebObjectStub
{
   public informeproduccionresumenoperariodp_wc( )
   {
   }

   public informeproduccionresumenoperariodp_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informeproduccionresumenoperariodp_wc.class ));
   }

   public informeproduccionresumenoperariodp_wc( int remoteHandle ,
                                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informeproduccionresumenoperariodp_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informeproduccionresumenoperariodp_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Producción Resumen Operario";
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

