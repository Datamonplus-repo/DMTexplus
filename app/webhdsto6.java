package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webhdsto6", "/app.webhdsto6"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webhdsto6 extends GXWebObjectStub
{
   public webhdsto6( )
   {
   }

   public webhdsto6( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webhdsto6.class ));
   }

   public webhdsto6( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webhdsto6_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webhdsto6_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Tabla HDSTO1";
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

