package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.entradaensayoslaboratorioproductos__wp", "/app.gestionlaboratorio.entradaensayoslaboratorioproductos__wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class entradaensayoslaboratorioproductos__wp extends GXWebObjectStub
{
   public entradaensayoslaboratorioproductos__wp( )
   {
   }

   public entradaensayoslaboratorioproductos__wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( entradaensayoslaboratorioproductos__wp.class ));
   }

   public entradaensayoslaboratorioproductos__wp( int remoteHandle ,
                                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new entradaensayoslaboratorioproductos__wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new entradaensayoslaboratorioproductos__wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Entrada Ensayos Laboratorio Productos ";
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

