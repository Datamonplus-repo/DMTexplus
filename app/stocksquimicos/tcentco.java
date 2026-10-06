package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tcentco", "/app.stocksquimicos.tcentco"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcentco extends GXWebObjectStub
{
   public tcentco( )
   {
   }

   public tcentco( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcentco.class ));
   }

   public tcentco( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcentco_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcentco_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MANTENIMIENTO CENTROS COSTE";
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

