package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wpincidencias2", "/app.wpincidencias2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wpincidencias2 extends GXWebObjectStub
{
   public wpincidencias2( )
   {
   }

   public wpincidencias2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wpincidencias2.class ));
   }

   public wpincidencias2( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.wpincidencias2_impl pgm = new app.wpincidencias2_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wpincidencias2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wpincidencias2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Control de Incidencias";
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

