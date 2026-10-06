package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcconsultadevolucionesalmacentejidoencrudosindetalleexportcsv", "/app.wcconsultadevolucionesalmacentejidoencrudosindetalleexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcconsultadevolucionesalmacentejidoencrudosindetalleexportcsv extends GXWebObjectStub
{
   public wcconsultadevolucionesalmacentejidoencrudosindetalleexportcsv( )
   {
   }

   public wcconsultadevolucionesalmacentejidoencrudosindetalleexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcconsultadevolucionesalmacentejidoencrudosindetalleexportcsv.class ));
   }

   public wcconsultadevolucionesalmacentejidoencrudosindetalleexportcsv( int remoteHandle ,
                                                                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcconsultadevolucionesalmacentejidoencrudosindetalleexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcconsultadevolucionesalmacentejidoencrudosindetalleexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCConsulta Devoluciones Almacen Tejidoencrudosindetalle Export CSV";
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

