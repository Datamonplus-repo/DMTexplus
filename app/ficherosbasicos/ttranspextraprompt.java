package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttranspextraprompt", "/app.ficherosbasicos.ttranspextraprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttranspextraprompt extends GXWebObjectStub
{
   public ttranspextraprompt( )
   {
   }

   public ttranspextraprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttranspextraprompt.class ));
   }

   public ttranspextraprompt( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttranspextraprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttranspextraprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona TRANSPORTISTAS";
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

