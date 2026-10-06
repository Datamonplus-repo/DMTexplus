package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.analisiscosteshistoricosrecetas_sdt_wcexportcsv", "/app.formulaciontinte.analisiscosteshistoricosrecetas_sdt_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class analisiscosteshistoricosrecetas_sdt_wcexportcsv extends GXWebObjectStub
{
   public analisiscosteshistoricosrecetas_sdt_wcexportcsv( )
   {
   }

   public analisiscosteshistoricosrecetas_sdt_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( analisiscosteshistoricosrecetas_sdt_wcexportcsv.class ));
   }

   public analisiscosteshistoricosrecetas_sdt_wcexportcsv( int remoteHandle ,
                                                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new analisiscosteshistoricosrecetas_sdt_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new analisiscosteshistoricosrecetas_sdt_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Analisis Costes Historicos Recetas_SDT_WCExport CSV";
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

