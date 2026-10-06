package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wtest", "/app.wtest"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wtest extends GXWebObjectStub
{
   public wtest( )
   {
   }

   public wtest( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wtest.class ));
   }

   public wtest( int remoteHandle ,
                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.wtest_impl pgm = new app.wtest_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wtest_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wtest_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Force generation";
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

