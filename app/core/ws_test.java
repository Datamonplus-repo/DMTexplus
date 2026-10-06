package app.core ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.core.ws_test", "/app.core.ws_test"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ws_test extends GXWebObjectStub
{
   public ws_test( )
   {
   }

   public ws_test( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ws_test.class ));
   }

   public ws_test( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.core.ws_test_impl pgm = new app.core.ws_test_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ws_test_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ws_test_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WS_Test";
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

