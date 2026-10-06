package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.aschedulerrequesthandler", "/app.ficherosbasicos.aschedulerrequesthandler"})
@jakarta.servlet.annotation.MultipartConfig
public final  class aschedulerrequesthandler extends GXWebObjectStub
{
   public aschedulerrequesthandler( )
   {
   }

   public aschedulerrequesthandler( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( aschedulerrequesthandler.class ));
   }

   public aschedulerrequesthandler( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new aschedulerrequesthandler_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new aschedulerrequesthandler_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Scheduler Request Handler";
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

