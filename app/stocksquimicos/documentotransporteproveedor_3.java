package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.documentotransporteproveedor_3", "/app.stocksquimicos.documentotransporteproveedor_3"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentotransporteproveedor_3 extends GXWebObjectStub
{
   public documentotransporteproveedor_3( )
   {
   }

   public documentotransporteproveedor_3( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentotransporteproveedor_3.class ));
   }

   public documentotransporteproveedor_3( int remoteHandle ,
                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentotransporteproveedor_3_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentotransporteproveedor_3_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Documento Transporte Proveedor";
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

