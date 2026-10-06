package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacensindetalle.almacentejidodevolucion", "/app.almacensindetalle.almacentejidodevolucion"})
@jakarta.servlet.annotation.MultipartConfig
public final  class almacentejidodevolucion extends GXWebObjectStub
{
   public almacentejidodevolucion( )
   {
   }

   public almacentejidodevolucion( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( almacentejidodevolucion.class ));
   }

   public almacentejidodevolucion( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new almacentejidodevolucion_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new almacentejidodevolucion_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Almacen Tejido Devolucion";
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

