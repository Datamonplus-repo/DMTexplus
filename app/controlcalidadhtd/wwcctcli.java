package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.wwcctcli", "/app.controlcalidadhtd.wwcctcli"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wwcctcli extends GXWebObjectStub
{
   public wwcctcli( )
   {
   }

   public wwcctcli( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wwcctcli.class ));
   }

   public wwcctcli( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.controlcalidadhtd.wwcctcli_impl pgm = new app.controlcalidadhtd.wwcctcli_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wwcctcli_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wwcctcli_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "C.C Tipo por Cli./Serie/Color";
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

