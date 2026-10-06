package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.consultaproduccion_agrupadasacabados_wp", "/app.formulaciontinte.consultaproduccion_agrupadasacabados_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultaproduccion_agrupadasacabados_wp extends GXWebObjectStub
{
   public consultaproduccion_agrupadasacabados_wp( )
   {
   }

   public consultaproduccion_agrupadasacabados_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultaproduccion_agrupadasacabados_wp.class ));
   }

   public consultaproduccion_agrupadasacabados_wp( int remoteHandle ,
                                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultaproduccion_agrupadasacabados_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultaproduccion_agrupadasacabados_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consulta de Hdrs Agrupadas para Acabados";
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

