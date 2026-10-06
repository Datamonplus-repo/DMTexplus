package app.albaranescomerciales ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.albaranescomerciales.talcobsgeneral", "/app.albaranescomerciales.talcobsgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talcobsgeneral extends GXWebObjectStub
{
   public talcobsgeneral( )
   {
   }

   public talcobsgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talcobsgeneral.class ));
   }

   public talcobsgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talcobsgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talcobsgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TALCOBSGeneral";
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

