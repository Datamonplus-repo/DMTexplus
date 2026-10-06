package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.listadodiferenciarecuento_wcexportcsv", "/app.stocksquimicos.listadodiferenciarecuento_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class listadodiferenciarecuento_wcexportcsv extends GXWebObjectStub
{
   public listadodiferenciarecuento_wcexportcsv( )
   {
   }

   public listadodiferenciarecuento_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( listadodiferenciarecuento_wcexportcsv.class ));
   }

   public listadodiferenciarecuento_wcexportcsv( int remoteHandle ,
                                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new listadodiferenciarecuento_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new listadodiferenciarecuento_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Diferencia Recuento_WCExport CSV";
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

