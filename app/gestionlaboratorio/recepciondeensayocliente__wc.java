package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.recepciondeensayocliente__wc", "/app.gestionlaboratorio.recepciondeensayocliente__wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recepciondeensayocliente__wc extends GXWebObjectStub
{
   public recepciondeensayocliente__wc( )
   {
   }

   public recepciondeensayocliente__wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recepciondeensayocliente__wc.class ));
   }

   public recepciondeensayocliente__wc( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recepciondeensayocliente__wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recepciondeensayocliente__wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Recepcionde Ensayo Cliente";
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

