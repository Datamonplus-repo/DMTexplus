package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.salidasmanualesproductos_detalle", "/app.stocksquimicos.salidasmanualesproductos_detalle"})
@jakarta.servlet.annotation.MultipartConfig
public final  class salidasmanualesproductos_detalle extends GXWebObjectStub
{
   public salidasmanualesproductos_detalle( )
   {
   }

   public salidasmanualesproductos_detalle( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( salidasmanualesproductos_detalle.class ));
   }

   public salidasmanualesproductos_detalle( int remoteHandle ,
                                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new salidasmanualesproductos_detalle_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new salidasmanualesproductos_detalle_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Salidas Manuales Productos";
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

