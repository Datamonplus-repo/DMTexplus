package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.expedicionesautomatizadas.mensajeconfirmarsalir", "/app.expedicionesautomatizadas.mensajeconfirmarsalir"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mensajeconfirmarsalir extends GXWebObjectStub
{
   public mensajeconfirmarsalir( )
   {
   }

   public mensajeconfirmarsalir( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mensajeconfirmarsalir.class ));
   }

   public mensajeconfirmarsalir( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mensajeconfirmarsalir_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mensajeconfirmarsalir_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mensaje Confirmar";
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

