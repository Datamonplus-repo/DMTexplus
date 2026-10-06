package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.temppargeneral", "/app.temppargeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class temppargeneral extends GXWebObjectStub
{
   public temppargeneral( )
   {
   }

   public temppargeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( temppargeneral.class ));
   }

   public temppargeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new temppargeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new temppargeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TEMPPARGeneral";
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

