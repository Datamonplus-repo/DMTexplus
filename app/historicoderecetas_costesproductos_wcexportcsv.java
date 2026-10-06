package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.historicoderecetas_costesproductos_wcexportcsv", "/app.historicoderecetas_costesproductos_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class historicoderecetas_costesproductos_wcexportcsv extends GXWebObjectStub
{
   public historicoderecetas_costesproductos_wcexportcsv( )
   {
   }

   public historicoderecetas_costesproductos_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( historicoderecetas_costesproductos_wcexportcsv.class ));
   }

   public historicoderecetas_costesproductos_wcexportcsv( int remoteHandle ,
                                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new historicoderecetas_costesproductos_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new historicoderecetas_costesproductos_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Historicode Recetas_Costes Productos_WCExport CSV";
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

