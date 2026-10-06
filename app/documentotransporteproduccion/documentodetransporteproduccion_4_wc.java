package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentotransporteproduccion.documentodetransporteproduccion_4_wc", "/app.documentotransporteproduccion.documentodetransporteproduccion_4_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentodetransporteproduccion_4_wc extends GXWebObjectStub
{
   public documentodetransporteproduccion_4_wc( )
   {
   }

   public documentodetransporteproduccion_4_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentodetransporteproduccion_4_wc.class ));
   }

   public documentodetransporteproduccion_4_wc( int remoteHandle ,
                                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentodetransporteproduccion_4_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentodetransporteproduccion_4_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Detalle de Fases p/produccion (Servicios)";
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

