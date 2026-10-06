package app.comprasquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.comprasquimicos.webwmodprm", "/app.comprasquimicos.webwmodprm"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwmodprm extends GXWebObjectStub
{
   public webwmodprm( )
   {
   }

   public webwmodprm( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwmodprm.class ));
   }

   public webwmodprm( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwmodprm_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwmodprm_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Modificar Precios";
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

