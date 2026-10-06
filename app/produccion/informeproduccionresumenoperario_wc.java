package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.informeproduccionresumenoperario_wc", "/app.produccion.informeproduccionresumenoperario_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informeproduccionresumenoperario_wc extends GXWebObjectStub
{
   public informeproduccionresumenoperario_wc( )
   {
   }

   public informeproduccionresumenoperario_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informeproduccionresumenoperario_wc.class ));
   }

   public informeproduccionresumenoperario_wc( int remoteHandle ,
                                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informeproduccionresumenoperario_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informeproduccionresumenoperario_wc_impl(context).cleanup();
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

