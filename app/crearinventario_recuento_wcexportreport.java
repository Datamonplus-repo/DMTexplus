package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.crearinventario_recuento_wcexportreport", "/app.crearinventario_recuento_wcexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class crearinventario_recuento_wcexportreport extends GXWebObjectStub
{
   public crearinventario_recuento_wcexportreport( )
   {
   }

   public crearinventario_recuento_wcexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( crearinventario_recuento_wcexportreport.class ));
   }

   public crearinventario_recuento_wcexportreport( int remoteHandle ,
                                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new crearinventario_recuento_wcexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new crearinventario_recuento_wcexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Crear Inventario_recuento_WCExport Report";
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

