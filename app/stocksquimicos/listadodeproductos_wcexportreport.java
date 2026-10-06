package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.listadodeproductos_wcexportreport", "/app.stocksquimicos.listadodeproductos_wcexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class listadodeproductos_wcexportreport extends GXWebObjectStub
{
   public listadodeproductos_wcexportreport( )
   {
   }

   public listadodeproductos_wcexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( listadodeproductos_wcexportreport.class ));
   }

   public listadodeproductos_wcexportreport( int remoteHandle ,
                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new listadodeproductos_wcexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new listadodeproductos_wcexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado de Productos";
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

