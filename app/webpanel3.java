package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webpanel3", "/app.webpanel3"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webpanel3 extends GXWebObjectStub
{
   public webpanel3( )
   {
   }

   public webpanel3( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webpanel3.class ));
   }

   public webpanel3( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webpanel3_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webpanel3_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web Panel3";
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

