package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.documentotransporteproveedor_5", "/app.stocksquimicos.documentotransporteproveedor_5"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentotransporteproveedor_5 extends GXWebObjectStub
{
   public documentotransporteproveedor_5( )
   {
   }

   public documentotransporteproveedor_5( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentotransporteproveedor_5.class ));
   }

   public documentotransporteproveedor_5( int remoteHandle ,
                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentotransporteproveedor_5_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentotransporteproveedor_5_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Fichero RESULT.xml";
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

