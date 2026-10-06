package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tcentcowwexportcsv", "/app.stocksquimicos.tcentcowwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcentcowwexportcsv extends GXWebObjectStub
{
   public tcentcowwexportcsv( )
   {
   }

   public tcentcowwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcentcowwexportcsv.class ));
   }

   public tcentcowwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcentcowwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcentcowwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TCENTCOWWExport CSV";
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

