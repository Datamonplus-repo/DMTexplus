package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.wcalenda", "/app.ficherosbasicos.wcalenda"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcalenda extends GXWebObjectStub
{
   public wcalenda( )
   {
   }

   public wcalenda( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcalenda.class ));
   }

   public wcalenda( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.ficherosbasicos.wcalenda_impl pgm = new app.ficherosbasicos.wcalenda_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcalenda_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcalenda_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Calendario Maquinas";
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

