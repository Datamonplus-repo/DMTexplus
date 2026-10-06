package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.texplusnetlogin", "/app.texplusnetlogin"})
@jakarta.servlet.annotation.MultipartConfig
public final  class texplusnetlogin extends GXWebObjectStub
{
   public texplusnetlogin( )
   {
   }

   public texplusnetlogin( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( texplusnetlogin.class ));
   }

   public texplusnetlogin( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.texplusnetlogin_impl pgm = new app.texplusnetlogin_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new texplusnetlogin_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new texplusnetlogin_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Texplus NETLogin";
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

