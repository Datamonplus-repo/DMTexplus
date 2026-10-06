package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.readdirectory", "/app.readdirectory"})
@jakarta.servlet.annotation.MultipartConfig
public final  class readdirectory extends GXWebObjectStub
{
   public readdirectory( )
   {
   }

   public readdirectory( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( readdirectory.class ));
   }

   public readdirectory( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.readdirectory_impl pgm = new app.readdirectory_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new readdirectory_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new readdirectory_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Read Directory";
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

