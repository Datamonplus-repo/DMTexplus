package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.messageswp", "/app.messageswp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class messageswp extends GXWebObjectStub
{
   public messageswp( )
   {
   }

   public messageswp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( messageswp.class ));
   }

   public messageswp( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.messageswp_impl pgm = new app.messageswp_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new messageswp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new messageswp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Messages WP";
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

