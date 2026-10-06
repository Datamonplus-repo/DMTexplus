package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwcop002exportcsv", "/app.wcwcop002exportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwcop002exportcsv extends GXWebObjectStub
{
   public wcwcop002exportcsv( )
   {
   }

   public wcwcop002exportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwcop002exportcsv.class ));
   }

   public wcwcop002exportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwcop002exportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwcop002exportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCWcop002 Export CSV";
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

