package app.albaranes ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.albaranes.pwduse", "/app.albaranes.pwduse"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pwduse extends GXWebObjectStub
{
   public pwduse( )
   {
   }

   public pwduse( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pwduse.class ));
   }

   public pwduse( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pwduse_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pwduse_impl(context).cleanup();
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

