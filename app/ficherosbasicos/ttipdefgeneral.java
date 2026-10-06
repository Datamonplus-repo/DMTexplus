package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttipdefgeneral", "/app.ficherosbasicos.ttipdefgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipdefgeneral extends GXWebObjectStub
{
   public ttipdefgeneral( )
   {
   }

   public ttipdefgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipdefgeneral.class ));
   }

   public ttipdefgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipdefgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipdefgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPDEFGeneral";
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

