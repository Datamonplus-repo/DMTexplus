package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.documentotransporteproveedor_5exportreport", "/app.stocksquimicos.documentotransporteproveedor_5exportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentotransporteproveedor_5exportreport extends GXWebObjectStub
{
   public documentotransporteproveedor_5exportreport( )
   {
   }

   public documentotransporteproveedor_5exportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentotransporteproveedor_5exportreport.class ));
   }

   public documentotransporteproveedor_5exportreport( int remoteHandle ,
                                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentotransporteproveedor_5exportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentotransporteproveedor_5exportreport_impl(context).cleanup();
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

