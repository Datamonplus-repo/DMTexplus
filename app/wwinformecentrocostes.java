package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wwinformecentrocostes", "/app.wwinformecentrocostes"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wwinformecentrocostes extends GXWebObjectStub
{
   public wwinformecentrocostes( )
   {
   }

   public wwinformecentrocostes( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wwinformecentrocostes.class ));
   }

   public wwinformecentrocostes( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.wwinformecentrocostes_impl pgm = new app.wwinformecentrocostes_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wwinformecentrocostes_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wwinformecentrocostes_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informa por centro de Costes";
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

