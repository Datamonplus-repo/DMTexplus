package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wpteste2", "/app.wpteste2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wpteste2 extends GXWebObjectStub
{
   public wpteste2( )
   {
   }

   public wpteste2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wpteste2.class ));
   }

   public wpteste2( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.wpteste2_impl pgm = new app.wpteste2_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wpteste2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wpteste2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "wpteste2";
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

