package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttubosgeneral", "/app.ficherosbasicos.ttubosgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttubosgeneral extends GXWebObjectStub
{
   public ttubosgeneral( )
   {
   }

   public ttubosgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttubosgeneral.class ));
   }

   public ttubosgeneral( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttubosgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttubosgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTUBOSGeneral";
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

