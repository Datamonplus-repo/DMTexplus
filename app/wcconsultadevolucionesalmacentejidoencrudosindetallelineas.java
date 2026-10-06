package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcconsultadevolucionesalmacentejidoencrudosindetallelineas", "/app.wcconsultadevolucionesalmacentejidoencrudosindetallelineas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcconsultadevolucionesalmacentejidoencrudosindetallelineas extends GXWebObjectStub
{
   public wcconsultadevolucionesalmacentejidoencrudosindetallelineas( )
   {
   }

   public wcconsultadevolucionesalmacentejidoencrudosindetallelineas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcconsultadevolucionesalmacentejidoencrudosindetallelineas.class ));
   }

   public wcconsultadevolucionesalmacentejidoencrudosindetallelineas( int remoteHandle ,
                                                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcconsultadevolucionesalmacentejidoencrudosindetallelineas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcconsultadevolucionesalmacentejidoencrudosindetallelineas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Devolucion Almacen Tejido Crudo (sin detalle)";
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

