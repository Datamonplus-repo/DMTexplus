package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.ttipvalwwexportreport", "/app.stocksquimicos.ttipvalwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipvalwwexportreport extends GXWebObjectStub
{
   public ttipvalwwexportreport( )
   {
   }

   public ttipvalwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipvalwwexportreport.class ));
   }

   public ttipvalwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipvalwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipvalwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPVALWWExport Report";
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

