package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttipentwwexportreport", "/app.ttipentwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipentwwexportreport extends GXWebObjectStub
{
   public ttipentwwexportreport( )
   {
   }

   public ttipentwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipentwwexportreport.class ));
   }

   public ttipentwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipentwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipentwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPENTWWExport Report";
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

