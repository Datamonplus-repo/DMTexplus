package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.consultahistoricoderecetas", "/app.formulaciontinte.consultahistoricoderecetas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultahistoricoderecetas extends GXWebObjectStub
{
   public consultahistoricoderecetas( )
   {
   }

   public consultahistoricoderecetas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultahistoricoderecetas.class ));
   }

   public consultahistoricoderecetas( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultahistoricoderecetas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultahistoricoderecetas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consulta Historicode Recetas";
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

