package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.productosnonormas", "/app.stocksquimicos.productosnonormas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class productosnonormas extends GXWebObjectStub
{
   public productosnonormas( )
   {
   }

   public productosnonormas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( productosnonormas.class ));
   }

   public productosnonormas( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new productosnonormas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new productosnonormas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Productos que no se pueden utilizar en Normas";
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

