package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.facturacionmanualcomerciales___wp", "/app.facturacion.facturacionmanualcomerciales___wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class facturacionmanualcomerciales___wp extends GXWebObjectStub
{
   public facturacionmanualcomerciales___wp( )
   {
   }

   public facturacionmanualcomerciales___wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( facturacionmanualcomerciales___wp.class ));
   }

   public facturacionmanualcomerciales___wp( int remoteHandle ,
                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new facturacionmanualcomerciales___wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new facturacionmanualcomerciales___wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Facturacion Manual Comerciales (SDT)";
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

