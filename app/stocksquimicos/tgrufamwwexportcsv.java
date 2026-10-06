package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tgrufamwwexportcsv", "/app.stocksquimicos.tgrufamwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tgrufamwwexportcsv extends GXWebObjectStub
{
   public tgrufamwwexportcsv( )
   {
   }

   public tgrufamwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tgrufamwwexportcsv.class ));
   }

   public tgrufamwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tgrufamwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tgrufamwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TGRUFAMWWExport CSV";
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

