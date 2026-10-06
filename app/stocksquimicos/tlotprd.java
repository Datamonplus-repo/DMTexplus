package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tlotprd", "/app.stocksquimicos.tlotprd"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tlotprd extends GXWebObjectStub
{
   public tlotprd( )
   {
   }

   public tlotprd( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tlotprd.class ));
   }

   public tlotprd( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tlotprd_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tlotprd_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "LOTES PRODUCTOS QUIMICOS";
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

