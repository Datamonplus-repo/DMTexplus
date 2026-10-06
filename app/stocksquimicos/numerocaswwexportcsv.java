package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.numerocaswwexportcsv", "/app.stocksquimicos.numerocaswwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class numerocaswwexportcsv extends GXWebObjectStub
{
   public numerocaswwexportcsv( )
   {
   }

   public numerocaswwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( numerocaswwexportcsv.class ));
   }

   public numerocaswwexportcsv( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new numerocaswwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new numerocaswwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Numero Cas WWExport CSV";
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

