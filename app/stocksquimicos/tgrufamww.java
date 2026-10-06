package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tgrufamww", "/app.stocksquimicos.tgrufamww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tgrufamww extends GXWebObjectStub
{
   public tgrufamww( )
   {
   }

   public tgrufamww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tgrufamww.class ));
   }

   public tgrufamww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tgrufamww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tgrufamww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Familias Productos";
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

