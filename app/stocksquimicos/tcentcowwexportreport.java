package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tcentcowwexportreport", "/app.stocksquimicos.tcentcowwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcentcowwexportreport extends GXWebObjectStub
{
   public tcentcowwexportreport( )
   {
   }

   public tcentcowwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcentcowwexportreport.class ));
   }

   public tcentcowwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcentcowwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcentcowwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TCENTCOWWExport Report";
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

