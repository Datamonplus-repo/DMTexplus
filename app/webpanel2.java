package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webpanel2", "/app.webpanel2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webpanel2 extends GXWebObjectStub
{
   public webpanel2( )
   {
   }

   public webpanel2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webpanel2.class ));
   }

   public webpanel2( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.webpanel2_impl pgm = new app.webpanel2_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webpanel2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webpanel2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web Panel2";
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

