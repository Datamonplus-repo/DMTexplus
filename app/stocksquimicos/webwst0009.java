package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.webwst0009", "/app.stocksquimicos.webwst0009"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwst0009 extends GXWebObjectStub
{
   public webwst0009( )
   {
   }

   public webwst0009( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwst0009.class ));
   }

   public webwst0009( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwst0009_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwst0009_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Abc Stocks Almacen";
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

