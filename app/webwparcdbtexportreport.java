package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwparcdbtexportreport", "/app.webwparcdbtexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwparcdbtexportreport extends GXWebObjectStub
{
   public webwparcdbtexportreport( )
   {
   }

   public webwparcdbtexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwparcdbtexportreport.class ));
   }

   public webwparcdbtexportreport( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwparcdbtexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwparcdbtexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web WPar Cdbt Export Report";
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

