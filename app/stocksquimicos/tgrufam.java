package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tgrufam", "/app.stocksquimicos.tgrufam"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tgrufam extends GXWebObjectStub
{
   public tgrufam( )
   {
   }

   public tgrufam( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tgrufam.class ));
   }

   public tgrufam( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tgrufam_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tgrufam_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Familias Productos";
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

