package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.entradaensayoslaboratorioproductos_trn", "/app.gestionlaboratorio.entradaensayoslaboratorioproductos_trn"})
@jakarta.servlet.annotation.MultipartConfig
public final  class entradaensayoslaboratorioproductos_trn extends GXWebObjectStub
{
   public entradaensayoslaboratorioproductos_trn( )
   {
   }

   public entradaensayoslaboratorioproductos_trn( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( entradaensayoslaboratorioproductos_trn.class ));
   }

   public entradaensayoslaboratorioproductos_trn( int remoteHandle ,
                                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new entradaensayoslaboratorioproductos_trn_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new entradaensayoslaboratorioproductos_trn_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entrada Ensayos Laboratorio Productos ";
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

