package app.ponteway ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ponteway.testintegration", "/app.ponteway.testintegration"})
@jakarta.servlet.annotation.MultipartConfig
public final  class testintegration extends GXWebObjectStub
{
   public testintegration( )
   {
   }

   public testintegration( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( testintegration.class ));
   }

   public testintegration( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.ponteway.testintegration_impl pgm = new app.ponteway.testintegration_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new testintegration_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new testintegration_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entrada Automática de Malha Armazém";
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

