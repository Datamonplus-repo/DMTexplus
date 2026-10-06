package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ingenieria.in_recibir_wp", "/app.ingenieria.in_recibir_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class in_recibir_wp extends GXWebObjectStub
{
   public in_recibir_wp( )
   {
   }

   public in_recibir_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( in_recibir_wp.class ));
   }

   public in_recibir_wp( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.ingenieria.in_recibir_wp_impl pgm = new app.ingenieria.in_recibir_wp_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new in_recibir_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new in_recibir_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Lectura FIN";
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

