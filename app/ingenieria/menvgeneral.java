package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ingenieria.menvgeneral", "/app.ingenieria.menvgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class menvgeneral extends GXWebObjectStub
{
   public menvgeneral( )
   {
   }

   public menvgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( menvgeneral.class ));
   }

   public menvgeneral( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new menvgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new menvgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MEnv General";
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

