package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.mantenimientofacturaview", "/app.facturacion.mantenimientofacturaview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mantenimientofacturaview extends GXWebObjectStub
{
   public mantenimientofacturaview( )
   {
   }

   public mantenimientofacturaview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mantenimientofacturaview.class ));
   }

   public mantenimientofacturaview( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mantenimientofacturaview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mantenimientofacturaview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento Factura View";
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

