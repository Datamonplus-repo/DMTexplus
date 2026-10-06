package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webtoolsrsa", "/app.webtoolsrsa"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webtoolsrsa extends GXWebObjectStub
{
   public webtoolsrsa( )
   {
   }

   public webtoolsrsa( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webtoolsrsa.class ));
   }

   public webtoolsrsa( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.webtoolsrsa_impl pgm = new app.webtoolsrsa_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webtoolsrsa_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webtoolsrsa_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web Tools RSA";
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

