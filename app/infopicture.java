package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.infopicture", "/app.infopicture"})
@jakarta.servlet.annotation.MultipartConfig
public final  class infopicture extends GXWebObjectStub
{
   public infopicture( )
   {
   }

   public infopicture( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( infopicture.class ));
   }

   public infopicture( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.infopicture_impl pgm = new app.infopicture_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new infopicture_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new infopicture_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Info Picture";
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

