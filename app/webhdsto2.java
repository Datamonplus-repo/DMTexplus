package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webhdsto2", "/app.webhdsto2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webhdsto2 extends GXWebObjectStub
{
   public webhdsto2( )
   {
   }

   public webhdsto2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webhdsto2.class ));
   }

   public webhdsto2( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webhdsto2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webhdsto2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Suspender Hdr, Motivo";
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

