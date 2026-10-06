package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webtestenviobarcosedo", "/app.webtestenviobarcosedo"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webtestenviobarcosedo extends GXWebObjectStub
{
   public webtestenviobarcosedo( )
   {
   }

   public webtestenviobarcosedo( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webtestenviobarcosedo.class ));
   }

   public webtestenviobarcosedo( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.webtestenviobarcosedo_impl pgm = new app.webtestenviobarcosedo_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webtestenviobarcosedo_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webtestenviobarcosedo_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web Test Envio Barco Sedo";
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

