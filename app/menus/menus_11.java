package app.menus ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.menus.menus_11", "/app.menus.menus_11"})
@jakarta.servlet.annotation.MultipartConfig
public final  class menus_11 extends GXWebObjectStub
{
   public menus_11( )
   {
   }

   public menus_11( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( menus_11.class ));
   }

   public menus_11( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.menus.menus_11_impl pgm = new app.menus.menus_11_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new menus_11_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new menus_11_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Menus";
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

