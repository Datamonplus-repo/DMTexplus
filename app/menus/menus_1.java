package app.menus ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.menus.menus_1", "/app.menus.menus_1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class menus_1 extends GXWebObjectStub
{
   public menus_1( )
   {
   }

   public menus_1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( menus_1.class ));
   }

   public menus_1( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.menus.menus_1_impl pgm = new app.menus.menus_1_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new menus_1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new menus_1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Menus_1";
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

