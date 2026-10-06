package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.listadodeproveedores_wcexportreport", "/app.stocksquimicos.listadodeproveedores_wcexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class listadodeproveedores_wcexportreport extends GXWebObjectStub
{
   public listadodeproveedores_wcexportreport( )
   {
   }

   public listadodeproveedores_wcexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( listadodeproveedores_wcexportreport.class ));
   }

   public listadodeproveedores_wcexportreport( int remoteHandle ,
                                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new listadodeproveedores_wcexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new listadodeproveedores_wcexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listadode Proveedores_WCExport Report";
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

