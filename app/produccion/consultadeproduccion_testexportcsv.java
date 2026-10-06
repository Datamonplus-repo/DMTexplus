package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.consultadeproduccion_testexportcsv", "/app.produccion.consultadeproduccion_testexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultadeproduccion_testexportcsv extends GXWebObjectStub
{
   public consultadeproduccion_testexportcsv( )
   {
   }

   public consultadeproduccion_testexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultadeproduccion_testexportcsv.class ));
   }

   public consultadeproduccion_testexportcsv( int remoteHandle ,
                                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultadeproduccion_testexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultadeproduccion_testexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consultade Produccion_Test Export CSV";
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

