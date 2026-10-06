package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.compras_wc", "/app.stocksquimicos.compras_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class compras_wc extends GXWebObjectStub
{
   public compras_wc( )
   {
   }

   public compras_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( compras_wc.class ));
   }

   public compras_wc( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new compras_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new compras_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Tabla LPEDID";
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

