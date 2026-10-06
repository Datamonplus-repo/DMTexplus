package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tgrufamview", "/app.stocksquimicos.tgrufamview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tgrufamview extends GXWebObjectStub
{
   public tgrufamview( )
   {
   }

   public tgrufamview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tgrufamview.class ));
   }

   public tgrufamview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tgrufamview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tgrufamview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TGRUFAMView";
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

