package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.testdim", "/app.testdim"})
@jakarta.servlet.annotation.MultipartConfig
public final  class testdim extends GXWebObjectStub
{
   public testdim( )
   {
   }

   public testdim( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( testdim.class ));
   }

   public testdim( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new testdim_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new testdim_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TEST ESTABILIDAD DIMENSIONAL";
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

