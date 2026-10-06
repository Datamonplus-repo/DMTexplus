package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.colores_test", "/app.colores_test"})
@jakarta.servlet.annotation.MultipartConfig
public final  class colores_test extends GXWebObjectStub
{
   public colores_test( )
   {
   }

   public colores_test( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( colores_test.class ));
   }

   public colores_test( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.colores_test_impl pgm = new app.colores_test_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new colores_test_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new colores_test_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TESTE COLOR";
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

