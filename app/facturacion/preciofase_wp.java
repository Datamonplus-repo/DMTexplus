package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.preciofase_wp", "/app.facturacion.preciofase_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class preciofase_wp extends GXWebObjectStub
{
   public preciofase_wp( )
   {
   }

   public preciofase_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( preciofase_wp.class ));
   }

   public preciofase_wp( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new preciofase_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new preciofase_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Precio Fase ";
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

