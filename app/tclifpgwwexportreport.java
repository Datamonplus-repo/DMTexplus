package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tclifpgwwexportreport", "/app.tclifpgwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclifpgwwexportreport extends GXWebObjectStub
{
   public tclifpgwwexportreport( )
   {
   }

   public tclifpgwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclifpgwwexportreport.class ));
   }

   public tclifpgwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclifpgwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclifpgwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TCLIFPGWWExport Report";
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

