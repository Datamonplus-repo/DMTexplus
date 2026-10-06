package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.testconfirme", "/app.testconfirme"})
@jakarta.servlet.annotation.MultipartConfig
public final  class testconfirme extends GXWebObjectStub
{
   public testconfirme( )
   {
   }

   public testconfirme( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( testconfirme.class ));
   }

   public testconfirme( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.testconfirme_impl pgm = new app.testconfirme_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new testconfirme_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new testconfirme_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Test Confirme";
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

