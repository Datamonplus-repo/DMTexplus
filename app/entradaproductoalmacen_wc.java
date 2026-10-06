package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.entradaproductoalmacen_wc", "/app.entradaproductoalmacen_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class entradaproductoalmacen_wc extends GXWebObjectStub
{
   public entradaproductoalmacen_wc( )
   {
   }

   public entradaproductoalmacen_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( entradaproductoalmacen_wc.class ));
   }

   public entradaproductoalmacen_wc( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new entradaproductoalmacen_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new entradaproductoalmacen_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Entrada Producto Almacen";
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

