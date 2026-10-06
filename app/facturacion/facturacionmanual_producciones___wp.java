package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.facturacionmanual_producciones___wp", "/app.facturacion.facturacionmanual_producciones___wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class facturacionmanual_producciones___wp extends GXWebObjectStub
{
   public facturacionmanual_producciones___wp( )
   {
   }

   public facturacionmanual_producciones___wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( facturacionmanual_producciones___wp.class ));
   }

   public facturacionmanual_producciones___wp( int remoteHandle ,
                                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new facturacionmanual_producciones___wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new facturacionmanual_producciones___wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Facturacion Manual Producciones (SDT)";
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

