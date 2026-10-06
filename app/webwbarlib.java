package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwbarlib", "/app.webwbarlib"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwbarlib extends GXWebObjectStub
{
   public webwbarlib( )
   {
   }

   public webwbarlib( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwbarlib.class ));
   }

   public webwbarlib( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwbarlib_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwbarlib_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Code Bar Libre";
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

