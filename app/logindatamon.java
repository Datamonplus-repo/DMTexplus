package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.logindatamon", "/app.logindatamon"})
@jakarta.servlet.annotation.MultipartConfig
public final  class logindatamon extends GXWebObjectStub
{
   public logindatamon( )
   {
   }

   public logindatamon( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( logindatamon.class ));
   }

   public logindatamon( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.logindatamon_impl pgm = new app.logindatamon_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new logindatamon_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new logindatamon_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Login Datamon";
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

