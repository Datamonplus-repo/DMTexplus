package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcdupfasesexportreport", "/app.wcdupfasesexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcdupfasesexportreport extends GXWebObjectStub
{
   public wcdupfasesexportreport( )
   {
   }

   public wcdupfasesexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcdupfasesexportreport.class ));
   }

   public wcdupfasesexportreport( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcdupfasesexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcdupfasesexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCDup Fases Export Report";
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

