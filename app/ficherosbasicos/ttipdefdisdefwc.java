package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttipdefdisdefwc", "/app.ficherosbasicos.ttipdefdisdefwc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipdefdisdefwc extends GXWebObjectStub
{
   public ttipdefdisdefwc( )
   {
   }

   public ttipdefdisdefwc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipdefdisdefwc.class ));
   }

   public ttipdefdisdefwc( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipdefdisdefwc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipdefdisdefwc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPDEFDis Def WC";
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

