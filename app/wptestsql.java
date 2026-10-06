package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wptestsql", "/app.wptestsql"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wptestsql extends GXWebObjectStub
{
   public wptestsql( )
   {
   }

   public wptestsql( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wptestsql.class ));
   }

   public wptestsql( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.wptestsql_impl pgm = new app.wptestsql_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wptestsql_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wptestsql_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "wp Testsql";
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

