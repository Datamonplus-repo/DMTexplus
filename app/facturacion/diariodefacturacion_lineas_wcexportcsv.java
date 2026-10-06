package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.diariodefacturacion_lineas_wcexportcsv", "/app.facturacion.diariodefacturacion_lineas_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class diariodefacturacion_lineas_wcexportcsv extends GXWebObjectStub
{
   public diariodefacturacion_lineas_wcexportcsv( )
   {
   }

   public diariodefacturacion_lineas_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( diariodefacturacion_lineas_wcexportcsv.class ));
   }

   public diariodefacturacion_lineas_wcexportcsv( int remoteHandle ,
                                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new diariodefacturacion_lineas_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new diariodefacturacion_lineas_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Diariode Facturacion_lineas_WCExport CSV";
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

