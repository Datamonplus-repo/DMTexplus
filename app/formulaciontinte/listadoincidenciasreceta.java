package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.listadoincidenciasreceta", "/app.formulaciontinte.listadoincidenciasreceta"})
@jakarta.servlet.annotation.MultipartConfig
public final  class listadoincidenciasreceta extends GXWebObjectStub
{
   public listadoincidenciasreceta( )
   {
   }

   public listadoincidenciasreceta( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( listadoincidenciasreceta.class ));
   }

   public listadoincidenciasreceta( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new listadoincidenciasreceta_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new listadoincidenciasreceta_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Incidencias Receta";
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

