package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.facturasemitidas_wcexportcsv", "/app.facturacion.facturasemitidas_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class facturasemitidas_wcexportcsv extends GXWebObjectStub
{
   public facturasemitidas_wcexportcsv( )
   {
   }

   public facturasemitidas_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( facturasemitidas_wcexportcsv.class ));
   }

   public facturasemitidas_wcexportcsv( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new facturasemitidas_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new facturasemitidas_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Facturas Emitidas_WCExport CSV";
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

