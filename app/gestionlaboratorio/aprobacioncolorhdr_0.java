package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.aprobacioncolorhdr_0", "/app.gestionlaboratorio.aprobacioncolorhdr_0"})
@jakarta.servlet.annotation.MultipartConfig
public final  class aprobacioncolorhdr_0 extends GXWebObjectStub
{
   public aprobacioncolorhdr_0( )
   {
   }

   public aprobacioncolorhdr_0( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( aprobacioncolorhdr_0.class ));
   }

   public aprobacioncolorhdr_0( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.gestionlaboratorio.aprobacioncolorhdr_0_impl pgm = new app.gestionlaboratorio.aprobacioncolorhdr_0_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new aprobacioncolorhdr_0_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new aprobacioncolorhdr_0_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Aprobacion Color Hdr (pruebas)";
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

