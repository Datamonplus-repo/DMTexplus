package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.analisiscosteshistoricosrecetas_wp_test", "/app.formulaciontinte.analisiscosteshistoricosrecetas_wp_test"})
@jakarta.servlet.annotation.MultipartConfig
public final  class analisiscosteshistoricosrecetas_wp_test extends GXWebObjectStub
{
   public analisiscosteshistoricosrecetas_wp_test( )
   {
   }

   public analisiscosteshistoricosrecetas_wp_test( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( analisiscosteshistoricosrecetas_wp_test.class ));
   }

   public analisiscosteshistoricosrecetas_wp_test( int remoteHandle ,
                                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.formulaciontinte.analisiscosteshistoricosrecetas_wp_test_impl pgm = new app.formulaciontinte.analisiscosteshistoricosrecetas_wp_test_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new analisiscosteshistoricosrecetas_wp_test_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new analisiscosteshistoricosrecetas_wp_test_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Analisis Costes Historicos Recetas (test SDT)";
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

