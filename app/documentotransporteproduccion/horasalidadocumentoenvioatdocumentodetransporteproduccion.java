package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentotransporteproduccion.horasalidadocumentoenvioatdocumentodetransporteproduccion", "/app.documentotransporteproduccion.horasalidadocumentoenvioatdocumentodetransporteproduccion"})
@jakarta.servlet.annotation.MultipartConfig
public final  class horasalidadocumentoenvioatdocumentodetransporteproduccion extends GXWebObjectStub
{
   public horasalidadocumentoenvioatdocumentodetransporteproduccion( )
   {
   }

   public horasalidadocumentoenvioatdocumentodetransporteproduccion( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( horasalidadocumentoenvioatdocumentodetransporteproduccion.class ));
   }

   public horasalidadocumentoenvioatdocumentodetransporteproduccion( int remoteHandle ,
                                                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new horasalidadocumentoenvioatdocumentodetransporteproduccion_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new horasalidadocumentoenvioatdocumentodetransporteproduccion_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Hora Salida Documento Envio AT Documento de Transporte Produccion";
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

