package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.facturasemitidas_wcexportreport", "/app.facturacion.facturasemitidas_wcexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class facturasemitidas_wcexportreport extends GXWebObjectStub
{
   public facturasemitidas_wcexportreport( )
   {
   }

   public facturasemitidas_wcexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( facturasemitidas_wcexportreport.class ));
   }

   public facturasemitidas_wcexportreport( int remoteHandle ,
                                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new facturasemitidas_wcexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new facturasemitidas_wcexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Facturas Emitidas";
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

