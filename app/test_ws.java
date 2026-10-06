package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.test_ws", "/app.test_ws"})
@jakarta.servlet.annotation.MultipartConfig
public final  class test_ws extends GXWebObjectStub
{
   public test_ws( )
   {
   }

   public test_ws( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( test_ws.class ));
   }

   public test_ws( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.test_ws_impl pgm = new app.test_ws_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new test_ws_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new test_ws_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Test WEB SERVICE";
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

