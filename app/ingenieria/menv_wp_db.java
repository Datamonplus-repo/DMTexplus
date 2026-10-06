package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ingenieria.menv_wp_db", "/app.ingenieria.menv_wp_db"})
@jakarta.servlet.annotation.MultipartConfig
public final  class menv_wp_db extends GXWebObjectStub
{
   public menv_wp_db( )
   {
   }

   public menv_wp_db( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( menv_wp_db.class ));
   }

   public menv_wp_db( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new menv_wp_db_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new menv_wp_db_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Dashboard";
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

