package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ingenieria.incfggeneral", "/app.ingenieria.incfggeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class incfggeneral extends GXWebObjectStub
{
   public incfggeneral( )
   {
   }

   public incfggeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( incfggeneral.class ));
   }

   public incfggeneral( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new incfggeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new incfggeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "In Cfg General";
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

