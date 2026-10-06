package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.salidasmanualesproductos_cabeceraww", "/app.stocksquimicos.salidasmanualesproductos_cabeceraww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class salidasmanualesproductos_cabeceraww extends GXWebObjectStub
{
   public salidasmanualesproductos_cabeceraww( )
   {
   }

   public salidasmanualesproductos_cabeceraww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( salidasmanualesproductos_cabeceraww.class ));
   }

   public salidasmanualesproductos_cabeceraww( int remoteHandle ,
                                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new salidasmanualesproductos_cabeceraww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new salidasmanualesproductos_cabeceraww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Salidas Manuales Productos_Cabecera";
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

