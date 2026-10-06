package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tminvstlevel1wc", "/app.tminvstlevel1wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tminvstlevel1wc extends GXWebObjectStub
{
   public tminvstlevel1wc( )
   {
   }

   public tminvstlevel1wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tminvstlevel1wc.class ));
   }

   public tminvstlevel1wc( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tminvstlevel1wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tminvstlevel1wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMInv St Level1 WC";
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

