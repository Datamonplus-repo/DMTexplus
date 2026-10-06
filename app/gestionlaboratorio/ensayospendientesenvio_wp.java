package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.ensayospendientesenvio_wp", "/app.gestionlaboratorio.ensayospendientesenvio_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ensayospendientesenvio_wp extends GXWebObjectStub
{
   public ensayospendientesenvio_wp( )
   {
   }

   public ensayospendientesenvio_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ensayospendientesenvio_wp.class ));
   }

   public ensayospendientesenvio_wp( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ensayospendientesenvio_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ensayospendientesenvio_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Ensayos Pendientes Envio";
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

