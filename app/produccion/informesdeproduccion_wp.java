package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.informesdeproduccion_wp", "/app.produccion.informesdeproduccion_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informesdeproduccion_wp extends GXWebObjectStub
{
   public informesdeproduccion_wp( )
   {
   }

   public informesdeproduccion_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informesdeproduccion_wp.class ));
   }

   public informesdeproduccion_wp( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informesdeproduccion_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informesdeproduccion_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informes de Produccion";
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

