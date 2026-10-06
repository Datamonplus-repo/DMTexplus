package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.entradaproducto_trn", "/app.stocksquimicos.entradaproducto_trn"})
@jakarta.servlet.annotation.MultipartConfig
public final  class entradaproducto_trn extends GXWebObjectStub
{
   public entradaproducto_trn( )
   {
   }

   public entradaproducto_trn( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( entradaproducto_trn.class ));
   }

   public entradaproducto_trn( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new entradaproducto_trn_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new entradaproducto_trn_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entrada Producto (linea)";
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

