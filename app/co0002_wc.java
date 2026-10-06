package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.co0002_wc", "/app.co0002_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class co0002_wc extends GXWebObjectStub
{
   public co0002_wc( )
   {
   }

   public co0002_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( co0002_wc.class ));
   }

   public co0002_wc( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new co0002_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new co0002_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CO0002_WC";
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

