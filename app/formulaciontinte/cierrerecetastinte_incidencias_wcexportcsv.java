package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.cierrerecetastinte_incidencias_wcexportcsv", "/app.formulaciontinte.cierrerecetastinte_incidencias_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class cierrerecetastinte_incidencias_wcexportcsv extends GXWebObjectStub
{
   public cierrerecetastinte_incidencias_wcexportcsv( )
   {
   }

   public cierrerecetastinte_incidencias_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( cierrerecetastinte_incidencias_wcexportcsv.class ));
   }

   public cierrerecetastinte_incidencias_wcexportcsv( int remoteHandle ,
                                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cierrerecetastinte_incidencias_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cierrerecetastinte_incidencias_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Cierre Recetas Tinte_Incidencias_WCExport CSV";
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

