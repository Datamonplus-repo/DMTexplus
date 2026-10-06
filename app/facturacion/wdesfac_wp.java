package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.wdesfac_wp", "/app.facturacion.wdesfac_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wdesfac_wp extends GXWebObjectStub
{
   public wdesfac_wp( )
   {
   }

   public wdesfac_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wdesfac_wp.class ));
   }

   public wdesfac_wp( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wdesfac_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wdesfac_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "DesActualizacion de Facturas";
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

