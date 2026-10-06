package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.informeproduccionresumenturno__wc", "/app.produccion.informeproduccionresumenturno__wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informeproduccionresumenturno__wc extends GXWebObjectStub
{
   public informeproduccionresumenturno__wc( )
   {
   }

   public informeproduccionresumenturno__wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informeproduccionresumenturno__wc.class ));
   }

   public informeproduccionresumenturno__wc( int remoteHandle ,
                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informeproduccionresumenturno__wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informeproduccionresumenturno__wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Produccion Resumen Turno__WC";
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

