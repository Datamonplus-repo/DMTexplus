package app.test ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.test.barraprogreso", "/app.test.barraprogreso"})
@jakarta.servlet.annotation.MultipartConfig
public final  class barraprogreso extends GXWebObjectStub
{
   public barraprogreso( )
   {
   }

   public barraprogreso( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( barraprogreso.class ));
   }

   public barraprogreso( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.test.barraprogreso_impl pgm = new app.test.barraprogreso_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new barraprogreso_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new barraprogreso_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Barra Progreso";
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

