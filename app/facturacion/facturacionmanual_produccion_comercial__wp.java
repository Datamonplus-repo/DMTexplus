package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.facturacionmanual_produccion_comercial__wp", "/app.facturacion.facturacionmanual_produccion_comercial__wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class facturacionmanual_produccion_comercial__wp extends GXWebObjectStub
{
   public facturacionmanual_produccion_comercial__wp( )
   {
   }

   public facturacionmanual_produccion_comercial__wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( facturacionmanual_produccion_comercial__wp.class ));
   }

   public facturacionmanual_produccion_comercial__wp( int remoteHandle ,
                                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new facturacionmanual_produccion_comercial__wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new facturacionmanual_produccion_comercial__wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Facturacion Manual (Produccion,Comercial)";
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

