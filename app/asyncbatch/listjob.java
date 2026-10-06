package app.asyncbatch ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.asyncbatch.listjob", "/app.asyncbatch.listjob"})
@jakarta.servlet.annotation.MultipartConfig
public final  class listjob extends GXWebObjectStub
{
   public listjob( )
   {
   }

   public listjob( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( listjob.class ));
   }

   public listjob( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.asyncbatch.listjob_impl pgm = new app.asyncbatch.listjob_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new listjob_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new listjob_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "List Jobs";
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

