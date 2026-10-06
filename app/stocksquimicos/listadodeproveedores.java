package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.listadodeproveedores", "/app.stocksquimicos.listadodeproveedores"})
@jakarta.servlet.annotation.MultipartConfig
public final  class listadodeproveedores extends GXWebObjectStub
{
   public listadodeproveedores( )
   {
   }

   public listadodeproveedores( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( listadodeproveedores.class ));
   }

   public listadodeproveedores( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new listadodeproveedores_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new listadodeproveedores_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado de Proveedores";
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

