package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.facturaccionmanual___wp", "/app.facturacion.facturaccionmanual___wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class facturaccionmanual___wp extends GXWebObjectStub
{
   public facturaccionmanual___wp( )
   {
   }

   public facturaccionmanual___wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( facturaccionmanual___wp.class ));
   }

   public facturaccionmanual___wp( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new facturaccionmanual___wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new facturaccionmanual___wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Facturaccion Manual (SDT)";
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

