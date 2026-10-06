package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.proveedorporproducto_wp", "/app.proveedorporproducto_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class proveedorporproducto_wp extends GXWebObjectStub
{
   public proveedorporproducto_wp( )
   {
   }

   public proveedorporproducto_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( proveedorporproducto_wp.class ));
   }

   public proveedorporproducto_wp( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new proveedorporproducto_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new proveedorporproducto_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Proveedor por Producto";
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

