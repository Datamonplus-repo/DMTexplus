package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.consultasituacioncoleccion_opciones", "/app.gestionlaboratorio.consultasituacioncoleccion_opciones"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultasituacioncoleccion_opciones extends GXWebObjectStub
{
   public consultasituacioncoleccion_opciones( )
   {
   }

   public consultasituacioncoleccion_opciones( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultasituacioncoleccion_opciones.class ));
   }

   public consultasituacioncoleccion_opciones( int remoteHandle ,
                                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultasituacioncoleccion_opciones_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultasituacioncoleccion_opciones_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consulta Situacion Coleccion (Opciones)";
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

