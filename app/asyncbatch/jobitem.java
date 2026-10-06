package app.asyncbatch ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.asyncbatch.jobitem", "/app.asyncbatch.jobitem"})
@jakarta.servlet.annotation.MultipartConfig
public final  class jobitem extends GXWebObjectStub
{
   public jobitem( )
   {
   }

   public jobitem( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( jobitem.class ));
   }

   public jobitem( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new jobitem_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new jobitem_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "JOBITEM";
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

