package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcconsultadevolucionesalmacentejidoencrudosindetallelineasexportcsv", "/app.wcconsultadevolucionesalmacentejidoencrudosindetallelineasexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcconsultadevolucionesalmacentejidoencrudosindetallelineasexportcsv extends GXWebObjectStub
{
   public wcconsultadevolucionesalmacentejidoencrudosindetallelineasexportcsv( )
   {
   }

   public wcconsultadevolucionesalmacentejidoencrudosindetallelineasexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcconsultadevolucionesalmacentejidoencrudosindetallelineasexportcsv.class ));
   }

   public wcconsultadevolucionesalmacentejidoencrudosindetallelineasexportcsv( int remoteHandle ,
                                                                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcconsultadevolucionesalmacentejidoencrudosindetallelineasexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcconsultadevolucionesalmacentejidoencrudosindetallelineasexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCConsulta Devoluciones Almacen Tejidoencrudosindetalle Lineas Export CSV";
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

