package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwmaqfasexportcsv", "/app.webwmaqfasexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwmaqfasexportcsv extends GXWebObjectStub
{
   public webwmaqfasexportcsv( )
   {
   }

   public webwmaqfasexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwmaqfasexportcsv.class ));
   }

   public webwmaqfasexportcsv( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwmaqfasexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwmaqfasexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web Wmaqfas Export CSV";
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

