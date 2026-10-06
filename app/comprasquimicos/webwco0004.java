package app.comprasquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.comprasquimicos.webwco0004", "/app.comprasquimicos.webwco0004"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwco0004 extends GXWebObjectStub
{
   public webwco0004( )
   {
   }

   public webwco0004( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwco0004.class ));
   }

   public webwco0004( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwco0004_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwco0004_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Compras Productos Mes";
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

