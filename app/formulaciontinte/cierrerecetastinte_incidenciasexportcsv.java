package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.cierrerecetastinte_incidenciasexportcsv", "/app.formulaciontinte.cierrerecetastinte_incidenciasexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class cierrerecetastinte_incidenciasexportcsv extends GXWebObjectStub
{
   public cierrerecetastinte_incidenciasexportcsv( )
   {
   }

   public cierrerecetastinte_incidenciasexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( cierrerecetastinte_incidenciasexportcsv.class ));
   }

   public cierrerecetastinte_incidenciasexportcsv( int remoteHandle ,
                                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cierrerecetastinte_incidenciasexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cierrerecetastinte_incidenciasexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Cierre Recetas Tinte_Incidencias Export CSV";
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

