package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.documentotransporteproveedor_5exportcsv", "/app.stocksquimicos.documentotransporteproveedor_5exportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentotransporteproveedor_5exportcsv extends GXWebObjectStub
{
   public documentotransporteproveedor_5exportcsv( )
   {
   }

   public documentotransporteproveedor_5exportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentotransporteproveedor_5exportcsv.class ));
   }

   public documentotransporteproveedor_5exportcsv( int remoteHandle ,
                                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentotransporteproveedor_5exportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentotransporteproveedor_5exportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Documento Transporte Proveedor_5 Export CSV";
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

