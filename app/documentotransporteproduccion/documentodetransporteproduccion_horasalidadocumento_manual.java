package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentotransporteproduccion.documentodetransporteproduccion_horasalidadocumento_manual", "/app.documentotransporteproduccion.documentodetransporteproduccion_horasalidadocumento_manual"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentodetransporteproduccion_horasalidadocumento_manual extends GXWebObjectStub
{
   public documentodetransporteproduccion_horasalidadocumento_manual( )
   {
   }

   public documentodetransporteproduccion_horasalidadocumento_manual( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentodetransporteproduccion_horasalidadocumento_manual.class ));
   }

   public documentodetransporteproduccion_horasalidadocumento_manual( int remoteHandle ,
                                                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentodetransporteproduccion_horasalidadocumento_manual_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentodetransporteproduccion_horasalidadocumento_manual_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Fecha-Hora Salida MANUAL";
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

