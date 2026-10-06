package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tsustanww", "/app.stocksquimicos.tsustanww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tsustanww extends GXWebObjectStub
{
   public tsustanww( )
   {
   }

   public tsustanww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tsustanww.class ));
   }

   public tsustanww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tsustanww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tsustanww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Sustancias a controlar";
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

