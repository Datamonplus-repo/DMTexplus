package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wc_testcolexportreport", "/app.wc_testcolexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wc_testcolexportreport extends GXWebObjectStub
{
   public wc_testcolexportreport( )
   {
   }

   public wc_testcolexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wc_testcolexportreport.class ));
   }

   public wc_testcolexportreport( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wc_testcolexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wc_testcolexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WC_TEst Col Export Report";
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

