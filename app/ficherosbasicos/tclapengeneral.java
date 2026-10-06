package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tclapengeneral", "/app.ficherosbasicos.tclapengeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclapengeneral extends GXWebObjectStub
{
   public tclapengeneral( )
   {
   }

   public tclapengeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclapengeneral.class ));
   }

   public tclapengeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclapengeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclapengeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TCLAPENGeneral";
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

