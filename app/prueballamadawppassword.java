package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.prueballamadawppassword", "/app.prueballamadawppassword"})
@jakarta.servlet.annotation.MultipartConfig
public final  class prueballamadawppassword extends GXWebObjectStub
{
   public prueballamadawppassword( )
   {
   }

   public prueballamadawppassword( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( prueballamadawppassword.class ));
   }

   public prueballamadawppassword( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.prueballamadawppassword_impl pgm = new app.prueballamadawppassword_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new prueballamadawppassword_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new prueballamadawppassword_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Prueba Llamada Wp Password";
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

