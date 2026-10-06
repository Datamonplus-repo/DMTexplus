package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacensindetalle.imprimirdevolucion", "/app.almacensindetalle.imprimirdevolucion"})
@jakarta.servlet.annotation.MultipartConfig
public final  class imprimirdevolucion extends GXWebObjectStub
{
   public imprimirdevolucion( )
   {
   }

   public imprimirdevolucion( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( imprimirdevolucion.class ));
   }

   public imprimirdevolucion( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new imprimirdevolucion_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new imprimirdevolucion_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Imprimir Devolucion";
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

