package app.core ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.core.tclienvwwexportreport", "/app.core.tclienvwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclienvwwexportreport extends GXWebObjectStub
{
   public tclienvwwexportreport( )
   {
   }

   public tclienvwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclienvwwexportreport.class ));
   }

   public tclienvwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclienvwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclienvwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TCLIENVWWExport Report";
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

