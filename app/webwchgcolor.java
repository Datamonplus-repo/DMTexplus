package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwchgcolor", "/app.webwchgcolor"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwchgcolor extends GXWebObjectStub
{
   public webwchgcolor( )
   {
   }

   public webwchgcolor( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwchgcolor.class ));
   }

   public webwchgcolor( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwchgcolor_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwchgcolor_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Cambio de color";
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

