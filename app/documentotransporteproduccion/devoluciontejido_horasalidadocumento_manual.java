package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentotransporteproduccion.devoluciontejido_horasalidadocumento_manual", "/app.documentotransporteproduccion.devoluciontejido_horasalidadocumento_manual"})
@jakarta.servlet.annotation.MultipartConfig
public final  class devoluciontejido_horasalidadocumento_manual extends GXWebObjectStub
{
   public devoluciontejido_horasalidadocumento_manual( )
   {
   }

   public devoluciontejido_horasalidadocumento_manual( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( devoluciontejido_horasalidadocumento_manual.class ));
   }

   public devoluciontejido_horasalidadocumento_manual( int remoteHandle ,
                                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new devoluciontejido_horasalidadocumento_manual_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new devoluciontejido_horasalidadocumento_manual_impl(context).cleanup();
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

