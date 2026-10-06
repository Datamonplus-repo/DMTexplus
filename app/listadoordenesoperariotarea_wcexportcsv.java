package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.listadoordenesoperariotarea_wcexportcsv", "/app.listadoordenesoperariotarea_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class listadoordenesoperariotarea_wcexportcsv extends GXWebObjectStub
{
   public listadoordenesoperariotarea_wcexportcsv( )
   {
   }

   public listadoordenesoperariotarea_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( listadoordenesoperariotarea_wcexportcsv.class ));
   }

   public listadoordenesoperariotarea_wcexportcsv( int remoteHandle ,
                                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new listadoordenesoperariotarea_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new listadoordenesoperariotarea_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Ordenes Operario Tarea_WCExport CSV";
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

