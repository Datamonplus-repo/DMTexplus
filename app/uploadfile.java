package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.uploadfile", "/app.uploadfile", "/servlet/app.uploadfile/gxobject", "/app.uploadfile/gxobject"})
@jakarta.servlet.annotation.MultipartConfig
public final  class uploadfile extends GXWebObjectStub
{
   public uploadfile( )
   {
   }

   public uploadfile( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( uploadfile.class ));
   }

   public uploadfile( int remoteHandle ,
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
         new uploadfile_impl(context).doExecute();
      }
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new uploadfile_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Upload File";
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

