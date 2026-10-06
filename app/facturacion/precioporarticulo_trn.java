package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.precioporarticulo_trn", "/app.facturacion.precioporarticulo_trn"})
@jakarta.servlet.annotation.MultipartConfig
public final  class precioporarticulo_trn extends GXWebObjectStub
{
   public precioporarticulo_trn( )
   {
   }

   public precioporarticulo_trn( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( precioporarticulo_trn.class ));
   }

   public precioporarticulo_trn( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new precioporarticulo_trn_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new precioporarticulo_trn_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Precio por Articulo, Intensidades";
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

