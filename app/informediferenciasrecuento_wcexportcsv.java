package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.informediferenciasrecuento_wcexportcsv", "/app.informediferenciasrecuento_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informediferenciasrecuento_wcexportcsv extends GXWebObjectStub
{
   public informediferenciasrecuento_wcexportcsv( )
   {
   }

   public informediferenciasrecuento_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informediferenciasrecuento_wcexportcsv.class ));
   }

   public informediferenciasrecuento_wcexportcsv( int remoteHandle ,
                                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informediferenciasrecuento_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informediferenciasrecuento_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Diferencias Recuento_WCExport CSV";
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

