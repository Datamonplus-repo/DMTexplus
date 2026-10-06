package app.asyncbatch ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.asyncbatch.job", "/app.asyncbatch.job"})
@jakarta.servlet.annotation.MultipartConfig
public final  class job extends GXWebObjectStub
{
   public job( )
   {
   }

   public job( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( job.class ));
   }

   public job( int remoteHandle ,
               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new job_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new job_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "JOB";
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

