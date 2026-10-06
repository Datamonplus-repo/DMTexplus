package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.facturasemitidas_wc", "/app.facturacion.facturasemitidas_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class facturasemitidas_wc extends GXWebObjectStub
{
   public facturasemitidas_wc( )
   {
   }

   public facturasemitidas_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( facturasemitidas_wc.class ));
   }

   public facturasemitidas_wc( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new facturasemitidas_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new facturasemitidas_wc_impl(context).cleanup();
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

