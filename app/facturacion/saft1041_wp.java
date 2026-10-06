package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.saft1041_wp", "/app.facturacion.saft1041_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class saft1041_wp extends GXWebObjectStub
{
   public saft1041_wp( )
   {
   }

   public saft1041_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( saft1041_wp.class ));
   }

   public saft1041_wp( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new saft1041_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new saft1041_wp_impl(context).cleanup();
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

