package app.comprasquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.comprasquimicos.webseguimientoproveedor", "/app.comprasquimicos.webseguimientoproveedor"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webseguimientoproveedor extends GXWebObjectStub
{
   public webseguimientoproveedor( )
   {
   }

   public webseguimientoproveedor( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webseguimientoproveedor.class ));
   }

   public webseguimientoproveedor( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webseguimientoproveedor_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webseguimientoproveedor_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Seguimiento Proveedor";
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

