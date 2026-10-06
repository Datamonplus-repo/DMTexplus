package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wpdash", "/app.wpdash"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wpdash extends GXWebObjectStub
{
   public wpdash( )
   {
   }

   public wpdash( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wpdash.class ));
   }

   public wpdash( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.wpdash_impl pgm = new app.wpdash_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wpdash_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wpdash_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "wp Dash";
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

