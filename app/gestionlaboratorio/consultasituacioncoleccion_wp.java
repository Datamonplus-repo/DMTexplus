package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.consultasituacioncoleccion_wp", "/app.gestionlaboratorio.consultasituacioncoleccion_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultasituacioncoleccion_wp extends GXWebObjectStub
{
   public consultasituacioncoleccion_wp( )
   {
   }

   public consultasituacioncoleccion_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultasituacioncoleccion_wp.class ));
   }

   public consultasituacioncoleccion_wp( int remoteHandle ,
                                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultasituacioncoleccion_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultasituacioncoleccion_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consulta Situacion Coleccion";
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

