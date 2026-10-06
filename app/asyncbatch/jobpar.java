package app.asyncbatch ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.asyncbatch.jobpar", "/app.asyncbatch.jobpar"})
@jakarta.servlet.annotation.MultipartConfig
public final  class jobpar extends GXWebObjectStub
{
   public jobpar( )
   {
   }

   public jobpar( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( jobpar.class ));
   }

   public jobpar( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new jobpar_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new jobpar_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "JOBPAR";
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

