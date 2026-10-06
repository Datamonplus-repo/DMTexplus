package app.comprasquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.comprasquimicos.webwco0002", "/app.comprasquimicos.webwco0002"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwco0002 extends GXWebObjectStub
{
   public webwco0002( )
   {
   }

   public webwco0002( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwco0002.class ));
   }

   public webwco0002( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwco0002_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwco0002_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Abc Proveedores";
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

