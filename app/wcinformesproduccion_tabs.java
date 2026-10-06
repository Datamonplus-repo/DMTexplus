package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcinformesproduccion_tabs", "/app.wcinformesproduccion_tabs"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcinformesproduccion_tabs extends GXWebObjectStub
{
   public wcinformesproduccion_tabs( )
   {
   }

   public wcinformesproduccion_tabs( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcinformesproduccion_tabs.class ));
   }

   public wcinformesproduccion_tabs( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcinformesproduccion_tabs_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcinformesproduccion_tabs_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informes de Produccion (TABS)";
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

