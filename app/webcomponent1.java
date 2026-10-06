package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webcomponent1", "/app.webcomponent1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webcomponent1 extends GXWebObjectStub
{
   public webcomponent1( )
   {
   }

   public webcomponent1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webcomponent1.class ));
   }

   public webcomponent1( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webcomponent1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webcomponent1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web Component1";
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

