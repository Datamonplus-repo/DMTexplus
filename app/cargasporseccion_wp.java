package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.cargasporseccion_wp", "/app.cargasporseccion_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class cargasporseccion_wp extends GXWebObjectStub
{
   public cargasporseccion_wp( )
   {
   }

   public cargasporseccion_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( cargasporseccion_wp.class ));
   }

   public cargasporseccion_wp( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cargasporseccion_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cargasporseccion_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Cargas por Seccion";
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

