package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.webwkardex", "/app.stocksquimicos.webwkardex"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwkardex extends GXWebObjectStub
{
   public webwkardex( )
   {
   }

   public webwkardex( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwkardex.class ));
   }

   public webwkardex( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwkardex_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwkardex_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Kardex";
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

