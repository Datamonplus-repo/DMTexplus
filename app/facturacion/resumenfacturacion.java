package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.resumenfacturacion", "/app.facturacion.resumenfacturacion"})
@jakarta.servlet.annotation.MultipartConfig
public final  class resumenfacturacion extends GXWebObjectStub
{
   public resumenfacturacion( )
   {
   }

   public resumenfacturacion( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( resumenfacturacion.class ));
   }

   public resumenfacturacion( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new resumenfacturacion_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new resumenfacturacion_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Resumen Facturacion";
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

