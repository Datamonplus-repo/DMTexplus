package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.contenedor", "/app.pedidos.contenedor"})
@jakarta.servlet.annotation.MultipartConfig
public final  class contenedor extends GXWebObjectStub
{
   public contenedor( )
   {
   }

   public contenedor( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( contenedor.class ));
   }

   public contenedor( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new contenedor_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new contenedor_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Generacion Accesorios";
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

