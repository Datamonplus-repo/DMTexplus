package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.agregardocumentofactura", "/app.facturacion.agregardocumentofactura"})
@jakarta.servlet.annotation.MultipartConfig
public final  class agregardocumentofactura extends GXWebObjectStub
{
   public agregardocumentofactura( )
   {
   }

   public agregardocumentofactura( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( agregardocumentofactura.class ));
   }

   public agregardocumentofactura( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new agregardocumentofactura_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new agregardocumentofactura_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Agregar Documento Factura";
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

