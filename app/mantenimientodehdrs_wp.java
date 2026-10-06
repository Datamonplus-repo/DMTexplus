package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientodehdrs_wp", "/app.mantenimientodehdrs_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mantenimientodehdrs_wp extends GXWebObjectStub
{
   public mantenimientodehdrs_wp( )
   {
   }

   public mantenimientodehdrs_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mantenimientodehdrs_wp.class ));
   }

   public mantenimientodehdrs_wp( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mantenimientodehdrs_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mantenimientodehdrs_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento de HDRs";
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

