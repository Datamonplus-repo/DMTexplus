package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webhdsto4", "/app.webhdsto4"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webhdsto4 extends GXWebObjectStub
{
   public webhdsto4( )
   {
   }

   public webhdsto4( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webhdsto4.class ));
   }

   public webhdsto4( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webhdsto4_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webhdsto4_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Activacion HDR (Motivo)";
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

