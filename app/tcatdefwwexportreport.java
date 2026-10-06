package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcatdefwwexportreport", "/app.tcatdefwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcatdefwwexportreport extends GXWebObjectStub
{
   public tcatdefwwexportreport( )
   {
   }

   public tcatdefwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcatdefwwexportreport.class ));
   }

   public tcatdefwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcatdefwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcatdefwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TCat Def WWExport Report";
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

