package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.precioporarticulo_", "/app.facturacion.precioporarticulo_"})
@jakarta.servlet.annotation.MultipartConfig
public final  class precioporarticulo_ extends GXWebObjectStub
{
   public precioporarticulo_( )
   {
   }

   public precioporarticulo_( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( precioporarticulo_.class ));
   }

   public precioporarticulo_( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new precioporarticulo__impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new precioporarticulo__impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Precio por Articulo";
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

