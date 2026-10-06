package app.datamon ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.datamon.homedatamon", "/app.datamon.homedatamon"})
@jakarta.servlet.annotation.MultipartConfig
public final  class homedatamon extends GXWebObjectStub
{
   public homedatamon( )
   {
   }

   public homedatamon( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( homedatamon.class ));
   }

   public homedatamon( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.datamon.homedatamon_impl pgm = new app.datamon.homedatamon_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new homedatamon_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new homedatamon_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WWP_HomeTitle";
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

