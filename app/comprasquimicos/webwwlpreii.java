package app.comprasquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.comprasquimicos.webwwlpreii", "/app.comprasquimicos.webwwlpreii"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwwlpreii extends GXWebObjectStub
{
   public webwwlpreii( )
   {
   }

   public webwwlpreii( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwwlpreii.class ));
   }

   public webwwlpreii( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwwlpreii_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwwlpreii_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe de Precios Proveedor";
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

