package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttrmwwexportreport", "/app.ficherosbasicos.ttrmwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrmwwexportreport extends GXWebObjectStub
{
   public ttrmwwexportreport( )
   {
   }

   public ttrmwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrmwwexportreport.class ));
   }

   public ttrmwwexportreport( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrmwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrmwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTRMWWExport Report";
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

