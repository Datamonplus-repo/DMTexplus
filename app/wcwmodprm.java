package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwmodprm", "/app.wcwmodprm"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwmodprm extends GXWebObjectStub
{
   public wcwmodprm( )
   {
   }

   public wcwmodprm( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwmodprm.class ));
   }

   public wcwmodprm( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwmodprm_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwmodprm_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimeino de Precios";
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

