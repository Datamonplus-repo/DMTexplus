package app.comprasquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.comprasquimicos.webwco0012exportcsv", "/app.comprasquimicos.webwco0012exportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwco0012exportcsv extends GXWebObjectStub
{
   public webwco0012exportcsv( )
   {
   }

   public webwco0012exportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwco0012exportcsv.class ));
   }

   public webwco0012exportcsv( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwco0012exportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwco0012exportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web Wco0012 Export CSV";
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

