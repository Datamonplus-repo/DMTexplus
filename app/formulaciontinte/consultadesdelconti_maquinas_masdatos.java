package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.consultadesdelconti_maquinas_masdatos", "/app.formulaciontinte.consultadesdelconti_maquinas_masdatos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultadesdelconti_maquinas_masdatos extends GXWebObjectStub
{
   public consultadesdelconti_maquinas_masdatos( )
   {
   }

   public consultadesdelconti_maquinas_masdatos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultadesdelconti_maquinas_masdatos.class ));
   }

   public consultadesdelconti_maquinas_masdatos( int remoteHandle ,
                                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultadesdelconti_maquinas_masdatos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultadesdelconti_maquinas_masdatos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consultadesde Lconti_Maquinas_masdatos";
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

