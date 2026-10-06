package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wduser2_wp", "/app.wduser2_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wduser2_wp extends GXWebObjectStub
{
   public wduser2_wp( )
   {
   }

   public wduser2_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wduser2_wp.class ));
   }

   public wduser2_wp( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wduser2_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wduser2_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "";
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

