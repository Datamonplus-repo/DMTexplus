package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwkp107copy1", "/app.webwkp107copy1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwkp107copy1 extends GXWebObjectStub
{
   public webwkp107copy1( )
   {
   }

   public webwkp107copy1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwkp107copy1.class ));
   }

   public webwkp107copy1( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwkp107copy1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwkp107copy1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web Wkp107 Copy1";
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

