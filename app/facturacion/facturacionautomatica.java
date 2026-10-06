package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.facturacionautomatica", "/app.facturacion.facturacionautomatica"})
@jakarta.servlet.annotation.MultipartConfig
public final  class facturacionautomatica extends GXWebObjectStub
{
   public facturacionautomatica( )
   {
   }

   public facturacionautomatica( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( facturacionautomatica.class ));
   }

   public facturacionautomatica( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new facturacionautomatica_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new facturacionautomatica_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Facturacion Automatica";
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

