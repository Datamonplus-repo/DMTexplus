package app.balance ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.balance.wpexpauto", "/app.balance.wpexpauto"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wpexpauto extends GXWebObjectStub
{
   public wpexpauto( )
   {
   }

   public wpexpauto( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wpexpauto.class ));
   }

   public wpexpauto( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.balance.wpexpauto_impl pgm = new app.balance.wpexpauto_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wpexpauto_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wpexpauto_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " LMETPI";
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

