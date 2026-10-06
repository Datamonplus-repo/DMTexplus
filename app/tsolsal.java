package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tsolsal", "/app.tsolsal"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tsolsal extends GXWebObjectStub
{
   public tsolsal( )
   {
   }

   public tsolsal( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tsolsal.class ));
   }

   public tsolsal( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tsolsal_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tsolsal_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "SOLIDEZ A SALIVA";
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

