package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.numerocasprompt", "/app.stocksquimicos.numerocasprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class numerocasprompt extends GXWebObjectStub
{
   public numerocasprompt( )
   {
   }

   public numerocasprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( numerocasprompt.class ));
   }

   public numerocasprompt( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new numerocasprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new numerocasprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Numero Cas";
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

