package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.recalculohashfacturas", "/app.facturacion.recalculohashfacturas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recalculohashfacturas extends GXWebObjectStub
{
   public recalculohashfacturas( )
   {
   }

   public recalculohashfacturas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recalculohashfacturas.class ));
   }

   public recalculohashfacturas( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recalculohashfacturas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recalculohashfacturas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Re-calculo Hash Facturas";
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

