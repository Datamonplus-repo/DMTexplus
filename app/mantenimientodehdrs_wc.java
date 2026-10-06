package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientodehdrs_wc", "/app.mantenimientodehdrs_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mantenimientodehdrs_wc extends GXWebObjectStub
{
   public mantenimientodehdrs_wc( )
   {
   }

   public mantenimientodehdrs_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mantenimientodehdrs_wc.class ));
   }

   public mantenimientodehdrs_wc( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mantenimientodehdrs_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mantenimientodehdrs_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Mantenimiento HDRs";
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

