package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwmaqcdbtexportreport", "/app.webwmaqcdbtexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwmaqcdbtexportreport extends GXWebObjectStub
{
   public webwmaqcdbtexportreport( )
   {
   }

   public webwmaqcdbtexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwmaqcdbtexportreport.class ));
   }

   public webwmaqcdbtexportreport( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwmaqcdbtexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwmaqcdbtexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web WMaq Cdbt Export Report";
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

