package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.documentotransporteproveedor_6", "/app.stocksquimicos.documentotransporteproveedor_6"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentotransporteproveedor_6 extends GXWebObjectStub
{
   public documentotransporteproveedor_6( )
   {
   }

   public documentotransporteproveedor_6( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentotransporteproveedor_6.class ));
   }

   public documentotransporteproveedor_6( int remoteHandle ,
                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentotransporteproveedor_6_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentotransporteproveedor_6_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entrada manual Codigo AT";
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

