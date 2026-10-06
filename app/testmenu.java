package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.testmenu", "/app.testmenu"})
@jakarta.servlet.annotation.MultipartConfig
public final  class testmenu extends GXWebObjectStub
{
   public testmenu( )
   {
   }

   public testmenu( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( testmenu.class ));
   }

   public testmenu( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.testmenu_impl pgm = new app.testmenu_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new testmenu_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new testmenu_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " TMENUNIVEL1";
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

