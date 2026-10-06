package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwpwdgrl", "/app.webwpwdgrl"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwpwdgrl extends GXWebObjectStub
{
   public webwpwdgrl( )
   {
   }

   public webwpwdgrl( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwpwdgrl.class ));
   }

   public webwpwdgrl( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwpwdgrl_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwpwdgrl_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entrada Password";
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

