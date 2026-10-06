package app.comprasquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.comprasquimicos.webwcompro", "/app.comprasquimicos.webwcompro"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwcompro extends GXWebObjectStub
{
   public webwcompro( )
   {
   }

   public webwcompro( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwcompro.class ));
   }

   public webwcompro( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwcompro_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwcompro_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe de Compras Realizadas";
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

