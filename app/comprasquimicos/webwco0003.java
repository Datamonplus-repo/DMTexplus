package app.comprasquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.comprasquimicos.webwco0003", "/app.comprasquimicos.webwco0003"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwco0003 extends GXWebObjectStub
{
   public webwco0003( )
   {
   }

   public webwco0003( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwco0003.class ));
   }

   public webwco0003( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwco0003_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwco0003_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Compres Mes y Acumulados";
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

