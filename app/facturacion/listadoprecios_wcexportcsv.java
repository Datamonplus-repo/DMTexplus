package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.listadoprecios_wcexportcsv", "/app.facturacion.listadoprecios_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class listadoprecios_wcexportcsv extends GXWebObjectStub
{
   public listadoprecios_wcexportcsv( )
   {
   }

   public listadoprecios_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( listadoprecios_wcexportcsv.class ));
   }

   public listadoprecios_wcexportcsv( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new listadoprecios_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new listadoprecios_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Precios_WCExport CSV";
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

