package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.testtar1", "/app.testtar1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class testtar1 extends GXWebObjectStub
{
   public testtar1( )
   {
   }

   public testtar1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( testtar1.class ));
   }

   public testtar1( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new testtar1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new testtar1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tarifas Estampacion";
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

