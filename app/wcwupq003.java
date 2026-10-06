package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwupq003", "/app.wcwupq003"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwupq003 extends GXWebObjectStub
{
   public wcwupq003( )
   {
   }

   public wcwupq003( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwupq003.class ));
   }

   public wcwupq003( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwupq003_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwupq003_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consulta Cuenta Corriente Producto (v 03)";
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

