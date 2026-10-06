package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.devolucionporproducto_wc", "/app.stocksquimicos.devolucionporproducto_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class devolucionporproducto_wc extends GXWebObjectStub
{
   public devolucionporproducto_wc( )
   {
   }

   public devolucionporproducto_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( devolucionporproducto_wc.class ));
   }

   public devolucionporproducto_wc( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new devolucionporproducto_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new devolucionporproducto_wc_impl(context).cleanup();
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

