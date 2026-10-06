package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.programacionmaquinasdrop", "/app.programacionmaquinasdrop"})
@jakarta.servlet.annotation.MultipartConfig
public final  class programacionmaquinasdrop extends GXWebObjectStub
{
   public programacionmaquinasdrop( )
   {
   }

   public programacionmaquinasdrop( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( programacionmaquinasdrop.class ));
   }

   public programacionmaquinasdrop( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.programacionmaquinasdrop_impl pgm = new app.programacionmaquinasdrop_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new programacionmaquinasdrop_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new programacionmaquinasdrop_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Programacion Maquinas Drop";
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

