package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.horasalidadocumentoenvioatdocumentotransportecomercial", "/app.stocksquimicos.horasalidadocumentoenvioatdocumentotransportecomercial"})
@jakarta.servlet.annotation.MultipartConfig
public final  class horasalidadocumentoenvioatdocumentotransportecomercial extends GXWebObjectStub
{
   public horasalidadocumentoenvioatdocumentotransportecomercial( )
   {
   }

   public horasalidadocumentoenvioatdocumentotransportecomercial( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( horasalidadocumentoenvioatdocumentotransportecomercial.class ));
   }

   public horasalidadocumentoenvioatdocumentotransportecomercial( int remoteHandle ,
                                                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new horasalidadocumentoenvioatdocumentotransportecomercial_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new horasalidadocumentoenvioatdocumentotransportecomercial_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Hora Salida Documento Envio AT Documento de Transporte Comercial";
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

