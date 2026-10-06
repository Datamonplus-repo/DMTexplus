package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.menusample", "/app.menusample"})
@jakarta.servlet.annotation.MultipartConfig
public final  class menusample extends GXWebObjectStub
{
   public menusample( )
   {
   }

   public menusample( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( menusample.class ));
   }

   public menusample( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.menusample_impl pgm = new app.menusample_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new menusample_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new menusample_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Menu Sample";
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

