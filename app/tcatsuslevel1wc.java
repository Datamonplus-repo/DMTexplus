package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcatsuslevel1wc", "/app.tcatsuslevel1wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcatsuslevel1wc extends GXWebObjectStub
{
   public tcatsuslevel1wc( )
   {
   }

   public tcatsuslevel1wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcatsuslevel1wc.class ));
   }

   public tcatsuslevel1wc( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcatsuslevel1wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcatsuslevel1wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TCATSUSLevel1 WC";
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

