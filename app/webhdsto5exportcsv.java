package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webhdsto5exportcsv", "/app.webhdsto5exportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webhdsto5exportcsv extends GXWebObjectStub
{
   public webhdsto5exportcsv( )
   {
   }

   public webhdsto5exportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webhdsto5exportcsv.class ));
   }

   public webhdsto5exportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webhdsto5exportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webhdsto5exportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web HDSTO5 Export CSV";
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

