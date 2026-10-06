package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.recetas_wc", "/app.stocksquimicos.recetas_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recetas_wc extends GXWebObjectStub
{
   public recetas_wc( )
   {
   }

   public recetas_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recetas_wc.class ));
   }

   public recetas_wc( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recetas_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recetas_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Tabla LRECET";
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

