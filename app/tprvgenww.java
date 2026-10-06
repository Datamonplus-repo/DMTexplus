package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tprvgenww", "/app.tprvgenww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprvgenww extends GXWebObjectStub
{
   public tprvgenww( )
   {
   }

   public tprvgenww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprvgenww.class ));
   }

   public tprvgenww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.tprvgenww_impl pgm = new app.tprvgenww_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprvgenww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprvgenww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento de Proveedores";
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

