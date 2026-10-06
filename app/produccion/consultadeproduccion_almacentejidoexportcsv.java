package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.consultadeproduccion_almacentejidoexportcsv", "/app.produccion.consultadeproduccion_almacentejidoexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultadeproduccion_almacentejidoexportcsv extends GXWebObjectStub
{
   public consultadeproduccion_almacentejidoexportcsv( )
   {
   }

   public consultadeproduccion_almacentejidoexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultadeproduccion_almacentejidoexportcsv.class ));
   }

   public consultadeproduccion_almacentejidoexportcsv( int remoteHandle ,
                                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultadeproduccion_almacentejidoexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultadeproduccion_almacentejidoexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consultade Produccion_Almacen Tejido Export CSV";
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

