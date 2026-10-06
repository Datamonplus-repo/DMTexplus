package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.precioporarticulo_____", "/app.facturacion.precioporarticulo_____"})
@jakarta.servlet.annotation.MultipartConfig
public final  class precioporarticulo_____ extends GXWebObjectStub
{
   public precioporarticulo_____( )
   {
   }

   public precioporarticulo_____( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( precioporarticulo_____.class ));
   }

   public precioporarticulo_____( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new precioporarticulo______impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new precioporarticulo______impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Precio por Articulo / Tipo Colorante";
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

