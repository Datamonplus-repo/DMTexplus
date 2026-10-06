package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.abcarticulofacturacion", "/app.facturacion.abcarticulofacturacion"})
@jakarta.servlet.annotation.MultipartConfig
public final  class abcarticulofacturacion extends GXWebObjectStub
{
   public abcarticulofacturacion( )
   {
   }

   public abcarticulofacturacion( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( abcarticulofacturacion.class ));
   }

   public abcarticulofacturacion( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new abcarticulofacturacion_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new abcarticulofacturacion_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ABC Articulo Facturacion";
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

