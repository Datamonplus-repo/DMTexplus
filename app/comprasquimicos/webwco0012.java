package app.comprasquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.comprasquimicos.webwco0012", "/app.comprasquimicos.webwco0012"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwco0012 extends GXWebObjectStub
{
   public webwco0012( )
   {
   }

   public webwco0012( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwco0012.class ));
   }

   public webwco0012( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwco0012_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwco0012_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Creacion Pedidos";
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

