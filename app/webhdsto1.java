package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webhdsto1", "/app.webhdsto1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webhdsto1 extends GXWebObjectStub
{
   public webhdsto1( )
   {
   }

   public webhdsto1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webhdsto1.class ));
   }

   public webhdsto1( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webhdsto1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webhdsto1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Suspender HDR";
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

