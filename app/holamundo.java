package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.holamundo", "/app.holamundo"})
@jakarta.servlet.annotation.MultipartConfig
public final  class holamundo extends GXWebObjectStub
{
   public holamundo( )
   {
   }

   public holamundo( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( holamundo.class ));
   }

   public holamundo( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.holamundo_impl pgm = new app.holamundo_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new holamundo_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new holamundo_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Hola Mundo";
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

