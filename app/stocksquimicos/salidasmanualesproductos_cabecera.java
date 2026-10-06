package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.salidasmanualesproductos_cabecera", "/app.stocksquimicos.salidasmanualesproductos_cabecera"})
@jakarta.servlet.annotation.MultipartConfig
public final  class salidasmanualesproductos_cabecera extends GXWebObjectStub
{
   public salidasmanualesproductos_cabecera( )
   {
   }

   public salidasmanualesproductos_cabecera( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( salidasmanualesproductos_cabecera.class ));
   }

   public salidasmanualesproductos_cabecera( int remoteHandle ,
                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new salidasmanualesproductos_cabecera_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new salidasmanualesproductos_cabecera_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Salidas Manuales Productos_Cabecera";
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

