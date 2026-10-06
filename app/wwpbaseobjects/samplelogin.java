package app.wwpbaseobjects ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wwpbaseobjects.samplelogin", "/app.wwpbaseobjects.samplelogin"})
@jakarta.servlet.annotation.MultipartConfig
public final  class samplelogin extends GXWebObjectStub
{
   public samplelogin( )
   {
   }

   public samplelogin( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( samplelogin.class ));
   }

   public samplelogin( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.wwpbaseobjects.samplelogin_impl pgm = new app.wwpbaseobjects.samplelogin_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new samplelogin_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new samplelogin_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Sample Log In";
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

