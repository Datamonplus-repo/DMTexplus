package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientoderecetasregistro_wp", "/app.mantenimientoderecetasregistro_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mantenimientoderecetasregistro_wp extends GXWebObjectStub
{
   public mantenimientoderecetasregistro_wp( )
   {
   }

   public mantenimientoderecetasregistro_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mantenimientoderecetasregistro_wp.class ));
   }

   public mantenimientoderecetasregistro_wp( int remoteHandle ,
                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mantenimientoderecetasregistro_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mantenimientoderecetasregistro_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento de Productos (Opcion por Registro)";
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

