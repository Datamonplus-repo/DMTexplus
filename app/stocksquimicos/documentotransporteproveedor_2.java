package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.documentotransporteproveedor_2", "/app.stocksquimicos.documentotransporteproveedor_2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentotransporteproveedor_2 extends GXWebObjectStub
{
   public documentotransporteproveedor_2( )
   {
   }

   public documentotransporteproveedor_2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentotransporteproveedor_2.class ));
   }

   public documentotransporteproveedor_2( int remoteHandle ,
                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentotransporteproveedor_2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentotransporteproveedor_2_impl(context).cleanup();
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

