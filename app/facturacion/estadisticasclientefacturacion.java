package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.estadisticasclientefacturacion", "/app.facturacion.estadisticasclientefacturacion"})
@jakarta.servlet.annotation.MultipartConfig
public final  class estadisticasclientefacturacion extends GXWebObjectStub
{
   public estadisticasclientefacturacion( )
   {
   }

   public estadisticasclientefacturacion( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( estadisticasclientefacturacion.class ));
   }

   public estadisticasclientefacturacion( int remoteHandle ,
                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new estadisticasclientefacturacion_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new estadisticasclientefacturacion_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ABC Cliente Facturacion";
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

