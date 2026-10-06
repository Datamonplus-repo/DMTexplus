package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacensindetalle.devoluciontejido_fechahorasalida_xml_envio_at", "/app.almacensindetalle.devoluciontejido_fechahorasalida_xml_envio_at"})
@jakarta.servlet.annotation.MultipartConfig
public final  class devoluciontejido_fechahorasalida_xml_envio_at extends GXWebObjectStub
{
   public devoluciontejido_fechahorasalida_xml_envio_at( )
   {
   }

   public devoluciontejido_fechahorasalida_xml_envio_at( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( devoluciontejido_fechahorasalida_xml_envio_at.class ));
   }

   public devoluciontejido_fechahorasalida_xml_envio_at( int remoteHandle ,
                                                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new devoluciontejido_fechahorasalida_xml_envio_at_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new devoluciontejido_fechahorasalida_xml_envio_at_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Fecha-Hora Salida, Hash, Comunico a AT";
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

