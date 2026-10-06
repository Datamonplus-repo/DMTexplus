package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwwkp64_2exportcsv", "/app.wcwwkp64_2exportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwwkp64_2exportcsv extends GXWebObjectStub
{
   public wcwwkp64_2exportcsv( )
   {
   }

   public wcwwkp64_2exportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwwkp64_2exportcsv.class ));
   }

   public wcwwkp64_2exportcsv( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwwkp64_2exportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwwkp64_2exportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCWwkp64_2 Export CSV";
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

