package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webhdsto5", "/app.webhdsto5"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webhdsto5 extends GXWebObjectStub
{
   public webhdsto5( )
   {
   }

   public webhdsto5( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webhdsto5.class ));
   }

   public webhdsto5( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webhdsto5_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webhdsto5_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Activacion HDR";
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

