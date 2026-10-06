package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.testealbaran", "/app.testealbaran"})
@jakarta.servlet.annotation.MultipartConfig
public final  class testealbaran extends GXWebObjectStub
{
   public testealbaran( )
   {
   }

   public testealbaran( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( testealbaran.class ));
   }

   public testealbaran( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.testealbaran_impl pgm = new app.testealbaran_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new testealbaran_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new testealbaran_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TEste Albaran";
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

