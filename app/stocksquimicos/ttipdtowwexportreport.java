package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.ttipdtowwexportreport", "/app.stocksquimicos.ttipdtowwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipdtowwexportreport extends GXWebObjectStub
{
   public ttipdtowwexportreport( )
   {
   }

   public ttipdtowwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipdtowwexportreport.class ));
   }

   public ttipdtowwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipdtowwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipdtowwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPDTOWWExport Report";
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

