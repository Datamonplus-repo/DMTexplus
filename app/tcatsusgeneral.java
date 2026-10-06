package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcatsusgeneral", "/app.tcatsusgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcatsusgeneral extends GXWebObjectStub
{
   public tcatsusgeneral( )
   {
   }

   public tcatsusgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcatsusgeneral.class ));
   }

   public tcatsusgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcatsusgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcatsusgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TCATSUSGeneral";
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

