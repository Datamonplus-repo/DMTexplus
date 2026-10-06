package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.auditoria_wp", "/app.auditoria_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class auditoria_wp extends GXWebObjectStub
{
   public auditoria_wp( )
   {
   }

   public auditoria_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( auditoria_wp.class ));
   }

   public auditoria_wp( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.auditoria_wp_impl pgm = new app.auditoria_wp_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new auditoria_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new auditoria_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Auditoria Producto Quimico";
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

