package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.documentotransporteproveedor_4", "/app.stocksquimicos.documentotransporteproveedor_4"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentotransporteproveedor_4 extends GXWebObjectStub
{
   public documentotransporteproveedor_4( )
   {
   }

   public documentotransporteproveedor_4( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentotransporteproveedor_4.class ));
   }

   public documentotransporteproveedor_4( int remoteHandle ,
                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentotransporteproveedor_4_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentotransporteproveedor_4_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Documento Transporte Proveedor (Comunico WEBSERVICE modo TEST)";
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

