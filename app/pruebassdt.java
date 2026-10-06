package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pruebassdt", "/app.pruebassdt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pruebassdt extends GXWebObjectStub
{
   public pruebassdt( )
   {
   }

   public pruebassdt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pruebassdt.class ));
   }

   public pruebassdt( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.pruebassdt_impl pgm = new app.pruebassdt_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pruebassdt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pruebassdt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Pruebas Sdt";
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

