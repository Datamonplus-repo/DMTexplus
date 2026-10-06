package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcconsultadevolucionesalmacentejidoencrudosindetalleexportreport", "/app.wcconsultadevolucionesalmacentejidoencrudosindetalleexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcconsultadevolucionesalmacentejidoencrudosindetalleexportreport extends GXWebObjectStub
{
   public wcconsultadevolucionesalmacentejidoencrudosindetalleexportreport( )
   {
   }

   public wcconsultadevolucionesalmacentejidoencrudosindetalleexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcconsultadevolucionesalmacentejidoencrudosindetalleexportreport.class ));
   }

   public wcconsultadevolucionesalmacentejidoencrudosindetalleexportreport( int remoteHandle ,
                                                                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcconsultadevolucionesalmacentejidoencrudosindetalleexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcconsultadevolucionesalmacentejidoencrudosindetalleexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCConsulta Devoluciones Almacen Tejidoencrudosindetalle Export Report";
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

