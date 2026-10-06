package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.entradaensayolaboratorio_opciones", "/app.gestionlaboratorio.entradaensayolaboratorio_opciones"})
@jakarta.servlet.annotation.MultipartConfig
public final  class entradaensayolaboratorio_opciones extends GXWebObjectStub
{
   public entradaensayolaboratorio_opciones( )
   {
   }

   public entradaensayolaboratorio_opciones( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( entradaensayolaboratorio_opciones.class ));
   }

   public entradaensayolaboratorio_opciones( int remoteHandle ,
                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new entradaensayolaboratorio_opciones_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new entradaensayolaboratorio_opciones_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Ensayos, Opciones";
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

