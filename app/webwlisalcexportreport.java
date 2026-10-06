package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwlisalcexportreport", "/app.webwlisalcexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwlisalcexportreport extends GXWebObjectStub
{
   public webwlisalcexportreport( )
   {
   }

   public webwlisalcexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwlisalcexportreport.class ));
   }

   public webwlisalcexportreport( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwlisalcexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwlisalcexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web WLISALCExport Report";
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

