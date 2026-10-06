package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.enviodeensayoacliente", "/app.gestionlaboratorio.enviodeensayoacliente"})
@jakarta.servlet.annotation.MultipartConfig
public final  class enviodeensayoacliente extends GXWebObjectStub
{
   public enviodeensayoacliente( )
   {
   }

   public enviodeensayoacliente( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( enviodeensayoacliente.class ));
   }

   public enviodeensayoacliente( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new enviodeensayoacliente_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new enviodeensayoacliente_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Envio de Ensayo a Cliente";
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

