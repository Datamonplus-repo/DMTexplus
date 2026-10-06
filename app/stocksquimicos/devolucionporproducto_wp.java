package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.devolucionporproducto_wp", "/app.stocksquimicos.devolucionporproducto_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class devolucionporproducto_wp extends GXWebObjectStub
{
   public devolucionporproducto_wp( )
   {
   }

   public devolucionporproducto_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( devolucionporproducto_wp.class ));
   }

   public devolucionporproducto_wp( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new devolucionporproducto_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new devolucionporproducto_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Devolucion por Producto";
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

