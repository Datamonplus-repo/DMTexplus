package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.historicoderecetas_costesproductos_wc", "/app.historicoderecetas_costesproductos_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class historicoderecetas_costesproductos_wc extends GXWebObjectStub
{
   public historicoderecetas_costesproductos_wc( )
   {
   }

   public historicoderecetas_costesproductos_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( historicoderecetas_costesproductos_wc.class ));
   }

   public historicoderecetas_costesproductos_wc( int remoteHandle ,
                                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new historicoderecetas_costesproductos_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new historicoderecetas_costesproductos_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Historico Recetas (Productos)";
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

