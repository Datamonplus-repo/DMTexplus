package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwlismerexportcsv", "/app.webwlismerexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwlismerexportcsv extends GXWebObjectStub
{
   public webwlismerexportcsv( )
   {
   }

   public webwlismerexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwlismerexportcsv.class ));
   }

   public webwlismerexportcsv( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwlismerexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwlismerexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web Wlismer Export CSV";
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

