package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwcnsprodexportcsv", "/app.webwcnsprodexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwcnsprodexportcsv extends GXWebObjectStub
{
   public webwcnsprodexportcsv( )
   {
   }

   public webwcnsprodexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwcnsprodexportcsv.class ));
   }

   public webwcnsprodexportcsv( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwcnsprodexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwcnsprodexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web WCns Prod Export CSV";
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

