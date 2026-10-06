package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.horasalidadocumentoenvioatdocumentoproveedor", "/app.stocksquimicos.horasalidadocumentoenvioatdocumentoproveedor"})
@jakarta.servlet.annotation.MultipartConfig
public final  class horasalidadocumentoenvioatdocumentoproveedor extends GXWebObjectStub
{
   public horasalidadocumentoenvioatdocumentoproveedor( )
   {
   }

   public horasalidadocumentoenvioatdocumentoproveedor( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( horasalidadocumentoenvioatdocumentoproveedor.class ));
   }

   public horasalidadocumentoenvioatdocumentoproveedor( int remoteHandle ,
                                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new horasalidadocumentoenvioatdocumentoproveedor_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new horasalidadocumentoenvioatdocumentoproveedor_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Hora Salida Documento Envio AT (Documento Proveedor)";
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

