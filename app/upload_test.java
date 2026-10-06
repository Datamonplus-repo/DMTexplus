package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.upload_test", "/app.upload_test", "/servlet/app.upload_test/gxobject", "/app.upload_test/gxobject"})
@jakarta.servlet.annotation.MultipartConfig
public final  class upload_test extends GXWebObjectStub
{
   public upload_test( )
   {
   }

   public upload_test( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( upload_test.class ));
   }

   public upload_test( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      if ( HttpUtils.isUploadRequest(context) )
      {
         new GXObjectUploadServices().doInternalExecute(context);
      }
      else
      {
         new upload_test_impl(context).doExecute();
      }
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new upload_test_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Upload_Test";
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

