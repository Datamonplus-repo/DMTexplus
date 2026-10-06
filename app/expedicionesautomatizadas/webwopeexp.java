package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.expedicionesautomatizadas.webwopeexp", "/app.expedicionesautomatizadas.webwopeexp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwopeexp extends GXWebObjectStub
{
   public webwopeexp( )
   {
   }

   public webwopeexp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwopeexp.class ));
   }

   public webwopeexp( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.expedicionesautomatizadas.webwopeexp_impl pgm = new app.expedicionesautomatizadas.webwopeexp_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwopeexp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwopeexp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web WOPEEXP";
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

