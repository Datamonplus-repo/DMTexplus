package app.albaranescomerciales ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.albaranescomerciales.talcobs", "/app.albaranescomerciales.talcobs"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talcobs extends GXWebObjectStub
{
   public talcobs( )
   {
   }

   public talcobs( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talcobs.class ));
   }

   public talcobs( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talcobs_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talcobs_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "OBSERVACIONES";
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

