package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webpruebashash", "/app.webpruebashash"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webpruebashash extends GXWebObjectStub
{
   public webpruebashash( )
   {
   }

   public webpruebashash( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webpruebashash.class ));
   }

   public webpruebashash( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.webpruebashash_impl pgm = new app.webpruebashash_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webpruebashash_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webpruebashash_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web Pruebas Hash";
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

