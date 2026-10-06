package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.consultaproduccion_tabla_materializada", "/app.produccion.consultaproduccion_tabla_materializada"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultaproduccion_tabla_materializada extends GXWebObjectStub
{
   public consultaproduccion_tabla_materializada( )
   {
   }

   public consultaproduccion_tabla_materializada( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultaproduccion_tabla_materializada.class ));
   }

   public consultaproduccion_tabla_materializada( int remoteHandle ,
                                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultaproduccion_tabla_materializada_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultaproduccion_tabla_materializada_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Consulta de Produccion";
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

