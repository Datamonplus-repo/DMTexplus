package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwmodprm1exportcsv", "/app.wcwmodprm1exportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwmodprm1exportcsv extends GXWebObjectStub
{
   public wcwmodprm1exportcsv( )
   {
   }

   public wcwmodprm1exportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwmodprm1exportcsv.class ));
   }

   public wcwmodprm1exportcsv( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwmodprm1exportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwmodprm1exportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCWmodprm1 Export CSV";
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

