package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.analisiscostesbasicosdetalle_wcexportcsv", "/app.analisiscostesbasicosdetalle_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class analisiscostesbasicosdetalle_wcexportcsv extends GXWebObjectStub
{
   public analisiscostesbasicosdetalle_wcexportcsv( )
   {
   }

   public analisiscostesbasicosdetalle_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( analisiscostesbasicosdetalle_wcexportcsv.class ));
   }

   public analisiscostesbasicosdetalle_wcexportcsv( int remoteHandle ,
                                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new analisiscostesbasicosdetalle_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new analisiscostesbasicosdetalle_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Analisis Costes Basicos Detalle_WCExport CSV";
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

