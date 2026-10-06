package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pruebadeconexion", "/app.pruebadeconexion"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pruebadeconexion extends GXWebObjectStub
{
   public pruebadeconexion( )
   {
   }

   public pruebadeconexion( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pruebadeconexion.class ));
   }

   public pruebadeconexion( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.pruebadeconexion_impl pgm = new app.pruebadeconexion_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pruebadeconexion_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pruebadeconexion_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Pruebadeconexion";
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

