package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.recepciondeensayocliente", "/app.gestionlaboratorio.recepciondeensayocliente"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recepciondeensayocliente extends GXWebObjectStub
{
   public recepciondeensayocliente( )
   {
   }

   public recepciondeensayocliente( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recepciondeensayocliente.class ));
   }

   public recepciondeensayocliente( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recepciondeensayocliente_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recepciondeensayocliente_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Recepcion de Ensayo Cliente";
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

