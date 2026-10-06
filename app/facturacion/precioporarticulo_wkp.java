package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.precioporarticulo_wkp", "/app.facturacion.precioporarticulo_wkp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class precioporarticulo_wkp extends GXWebObjectStub
{
   public precioporarticulo_wkp( )
   {
   }

   public precioporarticulo_wkp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( precioporarticulo_wkp.class ));
   }

   public precioporarticulo_wkp( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new precioporarticulo_wkp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new precioporarticulo_wkp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Precio por Articulo, Intensidades";
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

