package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tmetpedwwexportreport", "/app.stocksquimicos.tmetpedwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmetpedwwexportreport extends GXWebObjectStub
{
   public tmetpedwwexportreport( )
   {
   }

   public tmetpedwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmetpedwwexportreport.class ));
   }

   public tmetpedwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmetpedwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmetpedwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMETPEDWWExport Report";
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

