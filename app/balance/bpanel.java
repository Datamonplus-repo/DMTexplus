package app.balance ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.balance.bpanel", "/app.balance.bpanel"})
@jakarta.servlet.annotation.MultipartConfig
public final  class bpanel extends GXWebObjectStub
{
   public bpanel( )
   {
   }

   public bpanel( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( bpanel.class ));
   }

   public bpanel( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.balance.bpanel_impl pgm = new app.balance.bpanel_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new bpanel_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new bpanel_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Panel Balance V1.0";
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

