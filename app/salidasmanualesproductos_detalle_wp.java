package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.salidasmanualesproductos_detalle_wp", "/app.salidasmanualesproductos_detalle_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class salidasmanualesproductos_detalle_wp extends GXWebObjectStub
{
   public salidasmanualesproductos_detalle_wp( )
   {
   }

   public salidasmanualesproductos_detalle_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( salidasmanualesproductos_detalle_wp.class ));
   }

   public salidasmanualesproductos_detalle_wp( int remoteHandle ,
                                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new salidasmanualesproductos_detalle_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new salidasmanualesproductos_detalle_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Salidas Manuales Productos";
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

