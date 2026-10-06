package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webcomponent2exportreport", "/app.webcomponent2exportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webcomponent2exportreport extends GXWebObjectStub
{
   public webcomponent2exportreport( )
   {
   }

   public webcomponent2exportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webcomponent2exportreport.class ));
   }

   public webcomponent2exportreport( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webcomponent2exportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webcomponent2exportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web Component2 Export Report";
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

