package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.rst0028", "/app.stocksquimicos.rst0028"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rst0028 extends GXWebObjectStub
{
   public rst0028( )
   {
   }

   public rst0028( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rst0028.class ));
   }

   public rst0028( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rst0028_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rst0028_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "LISTADO FICHA PROVEEDOR";
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

