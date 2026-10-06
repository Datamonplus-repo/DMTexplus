package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.testcil", "/app.testcil"})
@jakarta.servlet.annotation.MultipartConfig
public final  class testcil extends GXWebObjectStub
{
   public testcil( )
   {
   }

   public testcil( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( testcil.class ));
   }

   public testcil( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new testcil_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new testcil_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ESTADOS CILINDROS";
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

