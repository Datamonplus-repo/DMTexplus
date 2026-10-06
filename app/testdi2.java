package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.testdi2", "/app.testdi2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class testdi2 extends GXWebObjectStub
{
   public testdi2( )
   {
   }

   public testdi2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( testdi2.class ));
   }

   public testdi2( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new testdi2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new testdi2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MAS INFORMACION";
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

