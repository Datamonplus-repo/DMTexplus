package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.precioporarticulo__", "/app.facturacion.precioporarticulo__"})
@jakarta.servlet.annotation.MultipartConfig
public final  class precioporarticulo__ extends GXWebObjectStub
{
   public precioporarticulo__( )
   {
   }

   public precioporarticulo__( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( precioporarticulo__.class ));
   }

   public precioporarticulo__( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new precioporarticulo___impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new precioporarticulo___impl(context).cleanup();
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

