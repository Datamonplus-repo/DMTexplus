package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.numerocas", "/app.stocksquimicos.numerocas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class numerocas extends GXWebObjectStub
{
   public numerocas( )
   {
   }

   public numerocas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( numerocas.class ));
   }

   public numerocas( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new numerocas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new numerocas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Numero Cas";
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

