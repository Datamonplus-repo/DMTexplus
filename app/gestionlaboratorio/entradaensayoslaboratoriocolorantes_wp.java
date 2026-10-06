package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.entradaensayoslaboratoriocolorantes_wp", "/app.gestionlaboratorio.entradaensayoslaboratoriocolorantes_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class entradaensayoslaboratoriocolorantes_wp extends GXWebObjectStub
{
   public entradaensayoslaboratoriocolorantes_wp( )
   {
   }

   public entradaensayoslaboratoriocolorantes_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( entradaensayoslaboratoriocolorantes_wp.class ));
   }

   public entradaensayoslaboratoriocolorantes_wp( int remoteHandle ,
                                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new entradaensayoslaboratoriocolorantes_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new entradaensayoslaboratoriocolorantes_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Colorantes (Ensayos)";
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

