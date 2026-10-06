package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.entradaproductoalmacen_wp", "/app.entradaproductoalmacen_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class entradaproductoalmacen_wp extends GXWebObjectStub
{
   public entradaproductoalmacen_wp( )
   {
   }

   public entradaproductoalmacen_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( entradaproductoalmacen_wp.class ));
   }

   public entradaproductoalmacen_wp( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new entradaproductoalmacen_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new entradaproductoalmacen_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entrada Producto Almacen";
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

