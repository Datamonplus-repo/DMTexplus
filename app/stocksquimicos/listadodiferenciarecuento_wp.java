package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.listadodiferenciarecuento_wp", "/app.stocksquimicos.listadodiferenciarecuento_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class listadodiferenciarecuento_wp extends GXWebObjectStub
{
   public listadodiferenciarecuento_wp( )
   {
   }

   public listadodiferenciarecuento_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( listadodiferenciarecuento_wp.class ));
   }

   public listadodiferenciarecuento_wp( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new listadodiferenciarecuento_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new listadodiferenciarecuento_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Diferencia Recuento";
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

