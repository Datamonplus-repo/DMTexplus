package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.resumenfacturacion_wcexportreport", "/app.facturacion.resumenfacturacion_wcexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class resumenfacturacion_wcexportreport extends GXWebObjectStub
{
   public resumenfacturacion_wcexportreport( )
   {
   }

   public resumenfacturacion_wcexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( resumenfacturacion_wcexportreport.class ));
   }

   public resumenfacturacion_wcexportreport( int remoteHandle ,
                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new resumenfacturacion_wcexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new resumenfacturacion_wcexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Resumen de Facturacion";
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

