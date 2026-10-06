package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.documentotransporteproveedor_anulacion", "/app.stocksquimicos.documentotransporteproveedor_anulacion"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentotransporteproveedor_anulacion extends GXWebObjectStub
{
   public documentotransporteproveedor_anulacion( )
   {
   }

   public documentotransporteproveedor_anulacion( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentotransporteproveedor_anulacion.class ));
   }

   public documentotransporteproveedor_anulacion( int remoteHandle ,
                                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentotransporteproveedor_anulacion_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentotransporteproveedor_anulacion_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Anulacion Documento enviado a AT";
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

