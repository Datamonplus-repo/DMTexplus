package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.precioporarticulo____trn", "/app.facturacion.precioporarticulo____trn"})
@jakarta.servlet.annotation.MultipartConfig
public final  class precioporarticulo____trn extends GXWebObjectStub
{
   public precioporarticulo____trn( )
   {
   }

   public precioporarticulo____trn( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( precioporarticulo____trn.class ));
   }

   public precioporarticulo____trn( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new precioporarticulo____trn_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new precioporarticulo____trn_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Precio por Articulo / Tipo Colorante / Intensidades";
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

