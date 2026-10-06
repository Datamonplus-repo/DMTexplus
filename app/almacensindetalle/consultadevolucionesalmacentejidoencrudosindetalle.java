package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacensindetalle.consultadevolucionesalmacentejidoencrudosindetalle", "/app.almacensindetalle.consultadevolucionesalmacentejidoencrudosindetalle"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultadevolucionesalmacentejidoencrudosindetalle extends GXWebObjectStub
{
   public consultadevolucionesalmacentejidoencrudosindetalle( )
   {
   }

   public consultadevolucionesalmacentejidoencrudosindetalle( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultadevolucionesalmacentejidoencrudosindetalle.class ));
   }

   public consultadevolucionesalmacentejidoencrudosindetalle( int remoteHandle ,
                                                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultadevolucionesalmacentejidoencrudosindetalle_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultadevolucionesalmacentejidoencrudosindetalle_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consulta Devoluciones Almacen Tejido en crudo (sin detalle)";
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

