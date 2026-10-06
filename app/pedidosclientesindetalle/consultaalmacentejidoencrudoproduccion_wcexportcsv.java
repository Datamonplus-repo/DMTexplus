package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidosclientesindetalle.consultaalmacentejidoencrudoproduccion_wcexportcsv", "/app.pedidosclientesindetalle.consultaalmacentejidoencrudoproduccion_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultaalmacentejidoencrudoproduccion_wcexportcsv extends GXWebObjectStub
{
   public consultaalmacentejidoencrudoproduccion_wcexportcsv( )
   {
   }

   public consultaalmacentejidoencrudoproduccion_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultaalmacentejidoencrudoproduccion_wcexportcsv.class ));
   }

   public consultaalmacentejidoencrudoproduccion_wcexportcsv( int remoteHandle ,
                                                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultaalmacentejidoencrudoproduccion_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultaalmacentejidoencrudoproduccion_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consulta Almacen Tejidoencrudo Produccion_WCExport CSV";
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

