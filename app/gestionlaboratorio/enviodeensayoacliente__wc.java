package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.enviodeensayoacliente__wc", "/app.gestionlaboratorio.enviodeensayoacliente__wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class enviodeensayoacliente__wc extends GXWebObjectStub
{
   public enviodeensayoacliente__wc( )
   {
   }

   public enviodeensayoacliente__wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( enviodeensayoacliente__wc.class ));
   }

   public enviodeensayoacliente__wc( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new enviodeensayoacliente__wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new enviodeensayoacliente__wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Enviode Ensayo a Cliente";
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

