package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacensindetalle.listadoalmacentejido_wp", "/app.almacensindetalle.listadoalmacentejido_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class listadoalmacentejido_wp extends GXWebObjectStub
{
   public listadoalmacentejido_wp( )
   {
   }

   public listadoalmacentejido_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( listadoalmacentejido_wp.class ));
   }

   public listadoalmacentejido_wp( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new listadoalmacentejido_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new listadoalmacentejido_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Almacen Tejido";
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

