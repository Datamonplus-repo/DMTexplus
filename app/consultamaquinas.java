package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.consultamaquinas", "/app.consultamaquinas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultamaquinas extends GXWebObjectStub
{
   public consultamaquinas( )
   {
   }

   public consultamaquinas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultamaquinas.class ));
   }

   public consultamaquinas( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.consultamaquinas_impl pgm = new app.consultamaquinas_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultamaquinas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultamaquinas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consulta Maquinas";
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

