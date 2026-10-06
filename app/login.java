package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.login", "/app.login"})
@jakarta.servlet.annotation.MultipartConfig
public final  class login extends GXWebObjectStub
{
   public login( )
   {
   }

   public login( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( login.class ));
   }

   public login( int remoteHandle ,
                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.login_impl pgm = new app.login_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new login_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new login_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Acesso al Sistema";
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

