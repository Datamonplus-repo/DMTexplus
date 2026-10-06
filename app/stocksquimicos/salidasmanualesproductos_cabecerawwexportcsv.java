package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.salidasmanualesproductos_cabecerawwexportcsv", "/app.stocksquimicos.salidasmanualesproductos_cabecerawwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class salidasmanualesproductos_cabecerawwexportcsv extends GXWebObjectStub
{
   public salidasmanualesproductos_cabecerawwexportcsv( )
   {
   }

   public salidasmanualesproductos_cabecerawwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( salidasmanualesproductos_cabecerawwexportcsv.class ));
   }

   public salidasmanualesproductos_cabecerawwexportcsv( int remoteHandle ,
                                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new salidasmanualesproductos_cabecerawwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new salidasmanualesproductos_cabecerawwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Salidas Manuales Productos_Cabecera WWExport CSV";
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

