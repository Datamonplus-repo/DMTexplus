package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ingenieria.mpenvwc", "/app.ingenieria.mpenvwc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mpenvwc extends GXWebObjectStub
{
   public mpenvwc( )
   {
   }

   public mpenvwc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mpenvwc.class ));
   }

   public mpenvwc( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mpenvwc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mpenvwc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MPEnv WC";
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

