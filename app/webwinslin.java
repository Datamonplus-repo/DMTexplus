package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwinslin", "/app.webwinslin"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwinslin extends GXWebObjectStub
{
   public webwinslin( )
   {
   }

   public webwinslin( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwinslin.class ));
   }

   public webwinslin( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwinslin_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwinslin_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Procesos Quimicos";
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

