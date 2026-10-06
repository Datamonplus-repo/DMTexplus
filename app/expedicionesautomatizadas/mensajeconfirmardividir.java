package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.expedicionesautomatizadas.mensajeconfirmardividir", "/app.expedicionesautomatizadas.mensajeconfirmardividir"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mensajeconfirmardividir extends GXWebObjectStub
{
   public mensajeconfirmardividir( )
   {
   }

   public mensajeconfirmardividir( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mensajeconfirmardividir.class ));
   }

   public mensajeconfirmardividir( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mensajeconfirmardividir_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mensajeconfirmardividir_impl(context).cleanup();
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

