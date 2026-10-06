package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.consultadesdelconti_wp", "/app.formulaciontinte.consultadesdelconti_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultadesdelconti_wp extends GXWebObjectStub
{
   public consultadesdelconti_wp( )
   {
   }

   public consultadesdelconti_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultadesdelconti_wp.class ));
   }

   public consultadesdelconti_wp( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultadesdelconti_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultadesdelconti_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consulta Historico Recetas (from Lconti)";
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

