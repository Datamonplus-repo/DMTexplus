package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.enviodeensayoacliente_wc", "/app.gestionlaboratorio.enviodeensayoacliente_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class enviodeensayoacliente_wc extends GXWebObjectStub
{
   public enviodeensayoacliente_wc( )
   {
   }

   public enviodeensayoacliente_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( enviodeensayoacliente_wc.class ));
   }

   public enviodeensayoacliente_wc( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new enviodeensayoacliente_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new enviodeensayoacliente_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Envio de Ensayos a Cliente";
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

