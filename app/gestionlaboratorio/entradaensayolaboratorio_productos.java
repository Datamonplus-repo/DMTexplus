package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.entradaensayolaboratorio_productos", "/app.gestionlaboratorio.entradaensayolaboratorio_productos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class entradaensayolaboratorio_productos extends GXWebObjectStub
{
   public entradaensayolaboratorio_productos( )
   {
   }

   public entradaensayolaboratorio_productos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( entradaensayolaboratorio_productos.class ));
   }

   public entradaensayolaboratorio_productos( int remoteHandle ,
                                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new entradaensayolaboratorio_productos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new entradaensayolaboratorio_productos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entrada Ensayo Laboratorio (Productos)";
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

