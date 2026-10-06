package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwaltpin", "/app.webwaltpin"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwaltpin extends GXWebObjectStub
{
   public webwaltpin( )
   {
   }

   public webwaltpin( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwaltpin.class ));
   }

   public webwaltpin( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwaltpin_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwaltpin_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Alta N Recepcion";
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

