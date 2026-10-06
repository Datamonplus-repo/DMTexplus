package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.tpenmd_wp", "/app.facturacion.tpenmd_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpenmd_wp extends GXWebObjectStub
{
   public tpenmd_wp( )
   {
   }

   public tpenmd_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpenmd_wp.class ));
   }

   public tpenmd_wp( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpenmd_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpenmd_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Penalizaciones";
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

