package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.actualizarfacturas", "/app.facturacion.actualizarfacturas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class actualizarfacturas extends GXWebObjectStub
{
   public actualizarfacturas( )
   {
   }

   public actualizarfacturas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( actualizarfacturas.class ));
   }

   public actualizarfacturas( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new actualizarfacturas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new actualizarfacturas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Actualizar Facturas";
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

