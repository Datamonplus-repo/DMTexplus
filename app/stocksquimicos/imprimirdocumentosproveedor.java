package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.imprimirdocumentosproveedor", "/app.stocksquimicos.imprimirdocumentosproveedor"})
@jakarta.servlet.annotation.MultipartConfig
public final  class imprimirdocumentosproveedor extends GXWebObjectStub
{
   public imprimirdocumentosproveedor( )
   {
   }

   public imprimirdocumentosproveedor( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( imprimirdocumentosproveedor.class ));
   }

   public imprimirdocumentosproveedor( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new imprimirdocumentosproveedor_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new imprimirdocumentosproveedor_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Imprimir Documento Proveedor";
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

