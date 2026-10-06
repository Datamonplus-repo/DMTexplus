package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.hash_test", "/app.hash_test"})
@jakarta.servlet.annotation.MultipartConfig
public final  class hash_test extends GXWebObjectStub
{
   public hash_test( )
   {
   }

   public hash_test( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( hash_test.class ));
   }

   public hash_test( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.hash_test_impl pgm = new app.hash_test_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new hash_test_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new hash_test_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Hash_Test";
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

