package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.cierrerecetastinte_incidencias", "/app.formulaciontinte.cierrerecetastinte_incidencias"})
@jakarta.servlet.annotation.MultipartConfig
public final  class cierrerecetastinte_incidencias extends GXWebObjectStub
{
   public cierrerecetastinte_incidencias( )
   {
   }

   public cierrerecetastinte_incidencias( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( cierrerecetastinte_incidencias.class ));
   }

   public cierrerecetastinte_incidencias( int remoteHandle ,
                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cierrerecetastinte_incidencias_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cierrerecetastinte_incidencias_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Mantenimiento de Productos (Receta)";
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

