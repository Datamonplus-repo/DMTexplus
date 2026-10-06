package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.entradaproductoalmacen_trn", "/app.entradaproductoalmacen_trn"})
@jakarta.servlet.annotation.MultipartConfig
public final  class entradaproductoalmacen_trn extends GXWebObjectStub
{
   public entradaproductoalmacen_trn( )
   {
   }

   public entradaproductoalmacen_trn( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( entradaproductoalmacen_trn.class ));
   }

   public entradaproductoalmacen_trn( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new entradaproductoalmacen_trn_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new entradaproductoalmacen_trn_impl(context).cleanup();
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

