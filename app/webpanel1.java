package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webpanel1", "/app.webpanel1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webpanel1 extends GXWebObjectStub
{
   public webpanel1( )
   {
   }

   public webpanel1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webpanel1.class ));
   }

   public webpanel1( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webpanel1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webpanel1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web Panel1";
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

