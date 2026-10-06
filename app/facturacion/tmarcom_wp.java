package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.tmarcom_wp", "/app.facturacion.tmarcom_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmarcom_wp extends GXWebObjectStub
{
   public tmarcom_wp( )
   {
   }

   public tmarcom_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmarcom_wp.class ));
   }

   public tmarcom_wp( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmarcom_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmarcom_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Margem Comercialiçao";
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

