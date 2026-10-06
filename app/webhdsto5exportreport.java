package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webhdsto5exportreport", "/app.webhdsto5exportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webhdsto5exportreport extends GXWebObjectStub
{
   public webhdsto5exportreport( )
   {
   }

   public webhdsto5exportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webhdsto5exportreport.class ));
   }

   public webhdsto5exportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webhdsto5exportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webhdsto5exportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web HDSTO5 Export Report";
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

