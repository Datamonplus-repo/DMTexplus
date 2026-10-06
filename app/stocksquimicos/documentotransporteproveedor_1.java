package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.documentotransporteproveedor_1", "/app.stocksquimicos.documentotransporteproveedor_1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentotransporteproveedor_1 extends GXWebObjectStub
{
   public documentotransporteproveedor_1( )
   {
   }

   public documentotransporteproveedor_1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentotransporteproveedor_1.class ));
   }

   public documentotransporteproveedor_1( int remoteHandle ,
                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentotransporteproveedor_1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentotransporteproveedor_1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Documento Transporte Proveedor";
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

