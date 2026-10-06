package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mostrarqrcodes", "/app.mostrarqrcodes"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mostrarqrcodes extends GXWebObjectStub
{
   public mostrarqrcodes( )
   {
   }

   public mostrarqrcodes( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mostrarqrcodes.class ));
   }

   public mostrarqrcodes( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.mostrarqrcodes_impl pgm = new app.mostrarqrcodes_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mostrarqrcodes_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mostrarqrcodes_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mostrar QRCODES";
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

