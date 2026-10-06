package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.consultadeproduccion_sdt_wcexportcsv", "/app.produccion.consultadeproduccion_sdt_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultadeproduccion_sdt_wcexportcsv extends GXWebObjectStub
{
   public consultadeproduccion_sdt_wcexportcsv( )
   {
   }

   public consultadeproduccion_sdt_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultadeproduccion_sdt_wcexportcsv.class ));
   }

   public consultadeproduccion_sdt_wcexportcsv( int remoteHandle ,
                                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultadeproduccion_sdt_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultadeproduccion_sdt_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consultade Produccion_SDT_WCExport CSV";
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

