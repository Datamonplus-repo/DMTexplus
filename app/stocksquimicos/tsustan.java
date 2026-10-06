package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tsustan", "/app.stocksquimicos.tsustan"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tsustan extends GXWebObjectStub
{
   public tsustan( )
   {
   }

   public tsustan( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tsustan.class ));
   }

   public tsustan( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tsustan_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tsustan_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Sustancias a controlar";
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

