package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tclientwwexportreport", "/app.tclientwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclientwwexportreport extends GXWebObjectStub
{
   public tclientwwexportreport( )
   {
   }

   public tclientwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclientwwexportreport.class ));
   }

   public tclientwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclientwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclientwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TCLIENTWWExport Report";
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

