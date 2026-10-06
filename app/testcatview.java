package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.testcatview", "/app.testcatview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class testcatview extends GXWebObjectStub
{
   public testcatview( )
   {
   }

   public testcatview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( testcatview.class ));
   }

   public testcatview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new testcatview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new testcatview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TESTCATView";
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

