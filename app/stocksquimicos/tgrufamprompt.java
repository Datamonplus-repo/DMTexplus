package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tgrufamprompt", "/app.stocksquimicos.tgrufamprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tgrufamprompt extends GXWebObjectStub
{
   public tgrufamprompt( )
   {
   }

   public tgrufamprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tgrufamprompt.class ));
   }

   public tgrufamprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tgrufamprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tgrufamprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Familias Productos";
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

