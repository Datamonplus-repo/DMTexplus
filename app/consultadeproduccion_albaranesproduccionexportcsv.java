package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.consultadeproduccion_albaranesproduccionexportcsv", "/app.consultadeproduccion_albaranesproduccionexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultadeproduccion_albaranesproduccionexportcsv extends GXWebObjectStub
{
   public consultadeproduccion_albaranesproduccionexportcsv( )
   {
   }

   public consultadeproduccion_albaranesproduccionexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultadeproduccion_albaranesproduccionexportcsv.class ));
   }

   public consultadeproduccion_albaranesproduccionexportcsv( int remoteHandle ,
                                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultadeproduccion_albaranesproduccionexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultadeproduccion_albaranesproduccionexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consultade Produccion_Albaranes Produccion Export CSV";
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

