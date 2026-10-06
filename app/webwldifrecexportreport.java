package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwldifrecexportreport", "/app.webwldifrecexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwldifrecexportreport extends GXWebObjectStub
{
   public webwldifrecexportreport( )
   {
   }

   public webwldifrecexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwldifrecexportreport.class ));
   }

   public webwldifrecexportreport( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwldifrecexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwldifrecexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web Wldifrec Export Report";
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

