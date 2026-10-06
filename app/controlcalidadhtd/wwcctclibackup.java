package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.wwcctclibackup", "/app.controlcalidadhtd.wwcctclibackup"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wwcctclibackup extends GXWebObjectStub
{
   public wwcctclibackup( )
   {
   }

   public wwcctclibackup( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wwcctclibackup.class ));
   }

   public wwcctclibackup( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.controlcalidadhtd.wwcctclibackup_impl pgm = new app.controlcalidadhtd.wwcctclibackup_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wwcctclibackup_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wwcctclibackup_impl(context).cleanup();
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

