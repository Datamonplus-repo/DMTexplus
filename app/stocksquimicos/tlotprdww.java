package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tlotprdww", "/app.stocksquimicos.tlotprdww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tlotprdww extends GXWebObjectStub
{
   public tlotprdww( )
   {
   }

   public tlotprdww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tlotprdww.class ));
   }

   public tlotprdww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tlotprdww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tlotprdww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Lotes Producto";
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

