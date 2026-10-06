package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.entradaproductoalmacen_cierrelinea", "/app.entradaproductoalmacen_cierrelinea"})
@jakarta.servlet.annotation.MultipartConfig
public final  class entradaproductoalmacen_cierrelinea extends GXWebObjectStub
{
   public entradaproductoalmacen_cierrelinea( )
   {
   }

   public entradaproductoalmacen_cierrelinea( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( entradaproductoalmacen_cierrelinea.class ));
   }

   public entradaproductoalmacen_cierrelinea( int remoteHandle ,
                                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new entradaproductoalmacen_cierrelinea_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new entradaproductoalmacen_cierrelinea_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entrada Producto Almacen Cierre Linea";
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

