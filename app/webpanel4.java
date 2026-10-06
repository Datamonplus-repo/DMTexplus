package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webpanel4", "/app.webpanel4"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webpanel4 extends GXWebObjectStub
{
   public webpanel4( )
   {
   }

   public webpanel4( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webpanel4.class ));
   }

   public webpanel4( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webpanel4_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webpanel4_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web Panel4";
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

