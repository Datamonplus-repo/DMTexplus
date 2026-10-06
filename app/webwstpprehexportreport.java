package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwstpprehexportreport", "/app.webwstpprehexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwstpprehexportreport extends GXWebObjectStub
{
   public webwstpprehexportreport( )
   {
   }

   public webwstpprehexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwstpprehexportreport.class ));
   }

   public webwstpprehexportreport( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwstpprehexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwstpprehexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web WSTp Pre HExport Report";
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

