package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwwkp89exportcsv", "/app.wcwwkp89exportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwwkp89exportcsv extends GXWebObjectStub
{
   public wcwwkp89exportcsv( )
   {
   }

   public wcwwkp89exportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwwkp89exportcsv.class ));
   }

   public wcwwkp89exportcsv( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwwkp89exportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwwkp89exportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCWWkp89 Export CSV";
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

