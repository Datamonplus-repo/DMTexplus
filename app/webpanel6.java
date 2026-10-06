package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webpanel6", "/app.webpanel6"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webpanel6 extends GXWebObjectStub
{
   public webpanel6( )
   {
   }

   public webpanel6( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webpanel6.class ));
   }

   public webpanel6( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webpanel6_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webpanel6_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web Panel6";
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

