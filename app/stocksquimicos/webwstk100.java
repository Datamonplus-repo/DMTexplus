package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.webwstk100", "/app.stocksquimicos.webwstk100"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwstk100 extends GXWebObjectStub
{
   public webwstk100( )
   {
   }

   public webwstk100( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwstk100.class ));
   }

   public webwstk100( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwstk100_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwstk100_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Productos sin Movimiento";
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

