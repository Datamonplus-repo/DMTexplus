package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmmovstlevel1wc", "/app.tmmovstlevel1wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmmovstlevel1wc extends GXWebObjectStub
{
   public tmmovstlevel1wc( )
   {
   }

   public tmmovstlevel1wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmmovstlevel1wc.class ));
   }

   public tmmovstlevel1wc( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmmovstlevel1wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmmovstlevel1wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMMov St Level1 WC";
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

