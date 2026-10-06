package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tcentcoprompt", "/app.stocksquimicos.tcentcoprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcentcoprompt extends GXWebObjectStub
{
   public tcentcoprompt( )
   {
   }

   public tcentcoprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcentcoprompt.class ));
   }

   public tcentcoprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcentcoprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcentcoprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona MANTENIMIENTO CENTROS COSTE";
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

