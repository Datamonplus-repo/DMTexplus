package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.weboperariosexportreport", "/app.weboperariosexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class weboperariosexportreport extends GXWebObjectStub
{
   public weboperariosexportreport( )
   {
   }

   public weboperariosexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( weboperariosexportreport.class ));
   }

   public weboperariosexportreport( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new weboperariosexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new weboperariosexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web Operarios Export Report";
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

