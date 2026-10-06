package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcinformesproduccionreoperados_tabs", "/app.wcinformesproduccionreoperados_tabs"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcinformesproduccionreoperados_tabs extends GXWebObjectStub
{
   public wcinformesproduccionreoperados_tabs( )
   {
   }

   public wcinformesproduccionreoperados_tabs( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcinformesproduccionreoperados_tabs.class ));
   }

   public wcinformesproduccionreoperados_tabs( int remoteHandle ,
                                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcinformesproduccionreoperados_tabs_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcinformesproduccionreoperados_tabs_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCInformes Produccion Reoperados_tabs";
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

