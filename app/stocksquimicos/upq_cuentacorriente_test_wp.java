package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.upq_cuentacorriente_test_wp", "/app.stocksquimicos.upq_cuentacorriente_test_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class upq_cuentacorriente_test_wp extends GXWebObjectStub
{
   public upq_cuentacorriente_test_wp( )
   {
   }

   public upq_cuentacorriente_test_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( upq_cuentacorriente_test_wp.class ));
   }

   public upq_cuentacorriente_test_wp( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.stocksquimicos.upq_cuentacorriente_test_wp_impl pgm = new app.stocksquimicos.upq_cuentacorriente_test_wp_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new upq_cuentacorriente_test_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new upq_cuentacorriente_test_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "UPQ_Cuenta Corriente_test_WP";
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

