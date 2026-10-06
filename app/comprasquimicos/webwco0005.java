package app.comprasquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.comprasquimicos.webwco0005", "/app.comprasquimicos.webwco0005"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwco0005 extends GXWebObjectStub
{
   public webwco0005( )
   {
   }

   public webwco0005( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwco0005.class ));
   }

   public webwco0005( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwco0005_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwco0005_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Estadisticas Proveedores";
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

