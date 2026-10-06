package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.impresionfactura", "/app.facturacion.impresionfactura"})
@jakarta.servlet.annotation.MultipartConfig
public final  class impresionfactura extends GXWebObjectStub
{
   public impresionfactura( )
   {
   }

   public impresionfactura( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( impresionfactura.class ));
   }

   public impresionfactura( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new impresionfactura_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new impresionfactura_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Impresion Factura";
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

