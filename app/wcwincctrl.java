package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwincctrl", "/app.wcwincctrl"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwincctrl extends GXWebObjectStub
{
   public wcwincctrl( )
   {
   }

   public wcwincctrl( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwincctrl.class ));
   }

   public wcwincctrl( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwincctrl_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwincctrl_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Incidencias";
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

