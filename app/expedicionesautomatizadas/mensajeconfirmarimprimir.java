package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.expedicionesautomatizadas.mensajeconfirmarimprimir", "/app.expedicionesautomatizadas.mensajeconfirmarimprimir"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mensajeconfirmarimprimir extends GXWebObjectStub
{
   public mensajeconfirmarimprimir( )
   {
   }

   public mensajeconfirmarimprimir( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mensajeconfirmarimprimir.class ));
   }

   public mensajeconfirmarimprimir( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mensajeconfirmarimprimir_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mensajeconfirmarimprimir_impl(context).cleanup();
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

