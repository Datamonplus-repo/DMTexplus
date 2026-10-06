package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.informediferenciasrecuento_wcexportreport", "/app.informediferenciasrecuento_wcexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informediferenciasrecuento_wcexportreport extends GXWebObjectStub
{
   public informediferenciasrecuento_wcexportreport( )
   {
   }

   public informediferenciasrecuento_wcexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informediferenciasrecuento_wcexportreport.class ));
   }

   public informediferenciasrecuento_wcexportreport( int remoteHandle ,
                                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informediferenciasrecuento_wcexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informediferenciasrecuento_wcexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Diferencias Recuento_WCExport Report";
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

