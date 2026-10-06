package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.abcclientefacturacion", "/app.facturacion.abcclientefacturacion"})
@jakarta.servlet.annotation.MultipartConfig
public final  class abcclientefacturacion extends GXWebObjectStub
{
   public abcclientefacturacion( )
   {
   }

   public abcclientefacturacion( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( abcclientefacturacion.class ));
   }

   public abcclientefacturacion( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new abcclientefacturacion_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new abcclientefacturacion_impl(context).cleanup();
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

