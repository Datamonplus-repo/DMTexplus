package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webpwdgrl", "/app.webpwdgrl"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webpwdgrl extends GXWebObjectStub
{
   public webpwdgrl( )
   {
   }

   public webpwdgrl( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webpwdgrl.class ));
   }

   public webpwdgrl( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webpwdgrl_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webpwdgrl_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Clave";
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

