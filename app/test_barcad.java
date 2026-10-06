package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.test_barcad", "/app.test_barcad"})
@jakarta.servlet.annotation.MultipartConfig
public final  class test_barcad extends GXWebObjectStub
{
   public test_barcad( )
   {
   }

   public test_barcad( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( test_barcad.class ));
   }

   public test_barcad( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new test_barcad_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new test_barcad_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Test_BARCAD";
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

