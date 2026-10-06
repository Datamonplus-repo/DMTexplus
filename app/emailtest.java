package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.emailtest", "/app.emailtest"})
@jakarta.servlet.annotation.MultipartConfig
public final  class emailtest extends GXWebObjectStub
{
   public emailtest( )
   {
   }

   public emailtest( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( emailtest.class ));
   }

   public emailtest( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.emailtest_impl pgm = new app.emailtest_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new emailtest_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new emailtest_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Email Test";
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

