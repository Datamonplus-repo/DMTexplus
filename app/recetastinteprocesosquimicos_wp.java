package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.recetastinteprocesosquimicos_wp", "/app.recetastinteprocesosquimicos_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recetastinteprocesosquimicos_wp extends GXWebObjectStub
{
   public recetastinteprocesosquimicos_wp( )
   {
   }

   public recetastinteprocesosquimicos_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recetastinteprocesosquimicos_wp.class ));
   }

   public recetastinteprocesosquimicos_wp( int remoteHandle ,
                                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recetastinteprocesosquimicos_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recetastinteprocesosquimicos_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Recetas Tinte( Procesos Quimicos)";
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

