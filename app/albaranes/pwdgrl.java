package app.albaranes ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.albaranes.pwdgrl", "/app.albaranes.pwdgrl"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pwdgrl extends GXWebObjectStub
{
   public pwdgrl( )
   {
   }

   public pwdgrl( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pwdgrl.class ));
   }

   public pwdgrl( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pwdgrl_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pwdgrl_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Contraseña Usuario";
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

