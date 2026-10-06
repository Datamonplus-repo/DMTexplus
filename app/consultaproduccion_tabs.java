package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.consultaproduccion_tabs", "/app.consultaproduccion_tabs"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultaproduccion_tabs extends GXWebObjectStub
{
   public consultaproduccion_tabs( )
   {
   }

   public consultaproduccion_tabs( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultaproduccion_tabs.class ));
   }

   public consultaproduccion_tabs( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultaproduccion_tabs_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultaproduccion_tabs_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consulta Produccion";
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

