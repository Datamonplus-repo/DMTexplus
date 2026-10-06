package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.entradaensayolaboratorio_productos__wc", "/app.gestionlaboratorio.entradaensayolaboratorio_productos__wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class entradaensayolaboratorio_productos__wc extends GXWebObjectStub
{
   public entradaensayolaboratorio_productos__wc( )
   {
   }

   public entradaensayolaboratorio_productos__wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( entradaensayolaboratorio_productos__wc.class ));
   }

   public entradaensayolaboratorio_productos__wc( int remoteHandle ,
                                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new entradaensayolaboratorio_productos__wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new entradaensayolaboratorio_productos__wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entrada Ensayo Laboratorio Productos";
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

