package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.expedicionesautomatizadas.mensajeconfirmarimpresionetiqueta", "/app.expedicionesautomatizadas.mensajeconfirmarimpresionetiqueta"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mensajeconfirmarimpresionetiqueta extends GXWebObjectStub
{
   public mensajeconfirmarimpresionetiqueta( )
   {
   }

   public mensajeconfirmarimpresionetiqueta( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mensajeconfirmarimpresionetiqueta.class ));
   }

   public mensajeconfirmarimpresionetiqueta( int remoteHandle ,
                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mensajeconfirmarimpresionetiqueta_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mensajeconfirmarimpresionetiqueta_impl(context).cleanup();
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

