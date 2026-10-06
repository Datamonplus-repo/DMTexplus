package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.productosnocuaderno", "/app.stocksquimicos.productosnocuaderno"})
@jakarta.servlet.annotation.MultipartConfig
public final  class productosnocuaderno extends GXWebObjectStub
{
   public productosnocuaderno( )
   {
   }

   public productosnocuaderno( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( productosnocuaderno.class ));
   }

   public productosnocuaderno( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new productosnocuaderno_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new productosnocuaderno_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Productos que no se pueden utilizar en Cuaderno de Encargos";
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

