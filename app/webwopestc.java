package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwopestc", "/app.webwopestc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwopestc extends GXWebObjectStub
{
   public webwopestc( )
   {
   }

   public webwopestc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwopestc.class ));
   }

   public webwopestc( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwopestc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwopestc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CLAVE ESPECIAL-TOTAL COLORANTE";
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

