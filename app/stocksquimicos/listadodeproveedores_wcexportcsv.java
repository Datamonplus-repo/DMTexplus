package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.listadodeproveedores_wcexportcsv", "/app.stocksquimicos.listadodeproveedores_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class listadodeproveedores_wcexportcsv extends GXWebObjectStub
{
   public listadodeproveedores_wcexportcsv( )
   {
   }

   public listadodeproveedores_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( listadodeproveedores_wcexportcsv.class ));
   }

   public listadodeproveedores_wcexportcsv( int remoteHandle ,
                                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new listadodeproveedores_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new listadodeproveedores_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listadode Proveedores_WCExport CSV";
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

