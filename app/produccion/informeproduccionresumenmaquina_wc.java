package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.informeproduccionresumenmaquina_wc", "/app.produccion.informeproduccionresumenmaquina_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informeproduccionresumenmaquina_wc extends GXWebObjectStub
{
   public informeproduccionresumenmaquina_wc( )
   {
   }

   public informeproduccionresumenmaquina_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informeproduccionresumenmaquina_wc.class ));
   }

   public informeproduccionresumenmaquina_wc( int remoteHandle ,
                                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informeproduccionresumenmaquina_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informeproduccionresumenmaquina_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Producción Resumen - Datos por Máquina";
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

