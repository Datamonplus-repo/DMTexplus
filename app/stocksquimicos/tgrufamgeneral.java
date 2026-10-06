package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tgrufamgeneral", "/app.stocksquimicos.tgrufamgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tgrufamgeneral extends GXWebObjectStub
{
   public tgrufamgeneral( )
   {
   }

   public tgrufamgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tgrufamgeneral.class ));
   }

   public tgrufamgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tgrufamgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tgrufamgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TGRUFAMGeneral";
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

