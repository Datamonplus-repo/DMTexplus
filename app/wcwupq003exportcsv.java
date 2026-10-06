package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwupq003exportcsv", "/app.wcwupq003exportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwupq003exportcsv extends GXWebObjectStub
{
   public wcwupq003exportcsv( )
   {
   }

   public wcwupq003exportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwupq003exportcsv.class ));
   }

   public wcwupq003exportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwupq003exportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwupq003exportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCWUPQ003 Export CSV";
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

