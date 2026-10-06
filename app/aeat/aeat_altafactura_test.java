package app.aeat ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.aeat.aeat_altafactura_test", "/app.aeat.aeat_altafactura_test"})
@jakarta.servlet.annotation.MultipartConfig
public final  class aeat_altafactura_test extends GXWebObjectStub
{
   public aeat_altafactura_test( )
   {
   }

   public aeat_altafactura_test( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( aeat_altafactura_test.class ));
   }

   public aeat_altafactura_test( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.aeat.aeat_altafactura_test_impl pgm = new app.aeat.aeat_altafactura_test_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new aeat_altafactura_test_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new aeat_altafactura_test_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "AEAT_Alta Factura_Test";
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

