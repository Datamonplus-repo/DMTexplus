package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwfirdigg", "/app.webwfirdigg"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwfirdigg extends GXWebObjectStub
{
   public webwfirdigg( )
   {
   }

   public webwfirdigg( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwfirdigg.class ));
   }

   public webwfirdigg( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwfirdigg_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwfirdigg_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "FIRMA DIGITAL GUIAS";
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

