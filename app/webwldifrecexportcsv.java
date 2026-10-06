package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwldifrecexportcsv", "/app.webwldifrecexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwldifrecexportcsv extends GXWebObjectStub
{
   public webwldifrecexportcsv( )
   {
   }

   public webwldifrecexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwldifrecexportcsv.class ));
   }

   public webwldifrecexportcsv( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwldifrecexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwldifrecexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web Wldifrec Export CSV";
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

