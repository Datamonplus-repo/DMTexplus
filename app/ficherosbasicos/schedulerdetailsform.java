package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.schedulerdetailsform", "/app.ficherosbasicos.schedulerdetailsform"})
@jakarta.servlet.annotation.MultipartConfig
public final  class schedulerdetailsform extends GXWebObjectStub
{
   public schedulerdetailsform( )
   {
   }

   public schedulerdetailsform( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( schedulerdetailsform.class ));
   }

   public schedulerdetailsform( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new schedulerdetailsform_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new schedulerdetailsform_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Scheduler Details Form";
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

