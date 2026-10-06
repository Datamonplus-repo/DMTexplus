package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webtest", "/app.webtest"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webtest extends GXWebObjectStub
{
   public webtest( )
   {
   }

   public webtest( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webtest.class ));
   }

   public webtest( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webtest_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webtest_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Webtest";
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

