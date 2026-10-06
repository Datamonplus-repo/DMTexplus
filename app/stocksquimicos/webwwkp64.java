package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.webwwkp64", "/app.stocksquimicos.webwwkp64"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwwkp64 extends GXWebObjectStub
{
   public webwwkp64( )
   {
   }

   public webwwkp64( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwwkp64.class ));
   }

   public webwwkp64( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwwkp64_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwwkp64_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Utilidad. Productos que NO se pueden utilizar en Cadernos Encargos";
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

