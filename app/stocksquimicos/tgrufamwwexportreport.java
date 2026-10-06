package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tgrufamwwexportreport", "/app.stocksquimicos.tgrufamwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tgrufamwwexportreport extends GXWebObjectStub
{
   public tgrufamwwexportreport( )
   {
   }

   public tgrufamwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tgrufamwwexportreport.class ));
   }

   public tgrufamwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tgrufamwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tgrufamwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TGRUFAMWWExport Report";
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

