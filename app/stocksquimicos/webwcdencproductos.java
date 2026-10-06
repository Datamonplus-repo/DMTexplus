package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.webwcdencproductos", "/app.stocksquimicos.webwcdencproductos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwcdencproductos extends GXWebObjectStub
{
   public webwcdencproductos( )
   {
   }

   public webwcdencproductos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwcdencproductos.class ));
   }

   public webwcdencproductos( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwcdencproductos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwcdencproductos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Cuardeno en Productos";
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

