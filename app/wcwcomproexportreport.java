package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwcomproexportreport", "/app.wcwcomproexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwcomproexportreport extends GXWebObjectStub
{
   public wcwcomproexportreport( )
   {
   }

   public wcwcomproexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwcomproexportreport.class ));
   }

   public wcwcomproexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwcomproexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwcomproexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCWcompro Export Report";
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

