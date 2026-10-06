package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.recetas_wcexportcsv", "/app.stocksquimicos.recetas_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recetas_wcexportcsv extends GXWebObjectStub
{
   public recetas_wcexportcsv( )
   {
   }

   public recetas_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recetas_wcexportcsv.class ));
   }

   public recetas_wcexportcsv( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recetas_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recetas_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Recetas_WCExport CSV";
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

