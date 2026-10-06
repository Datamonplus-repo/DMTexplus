package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.analisiscosteshistoricosrecetas_sdt_wc", "/app.formulaciontinte.analisiscosteshistoricosrecetas_sdt_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class analisiscosteshistoricosrecetas_sdt_wc extends GXWebObjectStub
{
   public analisiscosteshistoricosrecetas_sdt_wc( )
   {
   }

   public analisiscosteshistoricosrecetas_sdt_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( analisiscosteshistoricosrecetas_sdt_wc.class ));
   }

   public analisiscosteshistoricosrecetas_sdt_wc( int remoteHandle ,
                                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new analisiscosteshistoricosrecetas_sdt_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new analisiscosteshistoricosrecetas_sdt_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Analisis Costes Historicos Recetas_SDT_WC";
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

