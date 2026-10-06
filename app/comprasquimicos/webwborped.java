package app.comprasquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.comprasquimicos.webwborped", "/app.comprasquimicos.webwborped"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwborped extends GXWebObjectStub
{
   public webwborped( )
   {
   }

   public webwborped( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwborped.class ));
   }

   public webwborped( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwborped_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwborped_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Eliminar Pedidos Cerrados";
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

