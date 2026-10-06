package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.treccor_wp", "/app.facturacion.treccor_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class treccor_wp extends GXWebObjectStub
{
   public treccor_wp( )
   {
   }

   public treccor_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( treccor_wp.class ));
   }

   public treccor_wp( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new treccor_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new treccor_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Recargos por color";
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

