package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.ttipmovprompt", "/app.stocksquimicos.ttipmovprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipmovprompt extends GXWebObjectStub
{
   public ttipmovprompt( )
   {
   }

   public ttipmovprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipmovprompt.class ));
   }

   public ttipmovprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipmovprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipmovprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona TIPOS MOVIM. C.C. STOCKS";
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

