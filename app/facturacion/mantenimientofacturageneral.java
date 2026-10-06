package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.mantenimientofacturageneral", "/app.facturacion.mantenimientofacturageneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mantenimientofacturageneral extends GXWebObjectStub
{
   public mantenimientofacturageneral( )
   {
   }

   public mantenimientofacturageneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mantenimientofacturageneral.class ));
   }

   public mantenimientofacturageneral( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mantenimientofacturageneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mantenimientofacturageneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento Factura General";
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

