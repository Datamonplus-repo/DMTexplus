package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.ttipuniwwexportreport", "/app.stocksquimicos.ttipuniwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipuniwwexportreport extends GXWebObjectStub
{
   public ttipuniwwexportreport( )
   {
   }

   public ttipuniwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipuniwwexportreport.class ));
   }

   public ttipuniwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipuniwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipuniwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPUNIWWExport Report";
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

