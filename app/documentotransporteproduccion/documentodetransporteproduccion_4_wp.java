package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentotransporteproduccion.documentodetransporteproduccion_4_wp", "/app.documentotransporteproduccion.documentodetransporteproduccion_4_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentodetransporteproduccion_4_wp extends GXWebObjectStub
{
   public documentodetransporteproduccion_4_wp( )
   {
   }

   public documentodetransporteproduccion_4_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentodetransporteproduccion_4_wp.class ));
   }

   public documentodetransporteproduccion_4_wp( int remoteHandle ,
                                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentodetransporteproduccion_4_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentodetransporteproduccion_4_wp_impl(context).cleanup();
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

