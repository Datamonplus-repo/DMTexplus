package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdiscli", "/app.tdiscli"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdiscli extends GXWebObjectStub
{
   public tdiscli( )
   {
   }

   public tdiscli( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdiscli.class ));
   }

   public tdiscli( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdiscli_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdiscli_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Disposición Cliente";
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

