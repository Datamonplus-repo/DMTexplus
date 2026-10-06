package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ingenieria.menv", "/app.ingenieria.menv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class menv extends GXWebObjectStub
{
   public menv( )
   {
   }

   public menv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( menv.class ));
   }

   public menv( int remoteHandle ,
                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new menv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new menv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Envíos de parámetros de máquinas";
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

