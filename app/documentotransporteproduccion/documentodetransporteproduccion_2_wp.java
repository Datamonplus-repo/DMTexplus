package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentotransporteproduccion.documentodetransporteproduccion_2_wp", "/app.documentotransporteproduccion.documentodetransporteproduccion_2_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentodetransporteproduccion_2_wp extends GXWebObjectStub
{
   public documentodetransporteproduccion_2_wp( )
   {
   }

   public documentodetransporteproduccion_2_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentodetransporteproduccion_2_wp.class ));
   }

   public documentodetransporteproduccion_2_wp( int remoteHandle ,
                                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentodetransporteproduccion_2_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentodetransporteproduccion_2_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Detalle de Producciones";
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

