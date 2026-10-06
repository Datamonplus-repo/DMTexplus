package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.saft1041_wc", "/app.facturacion.saft1041_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class saft1041_wc extends GXWebObjectStub
{
   public saft1041_wc( )
   {
   }

   public saft1041_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( saft1041_wc.class ));
   }

   public saft1041_wc( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new saft1041_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new saft1041_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "StandardAuditFile-Tax:PT_1.04_01";
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

