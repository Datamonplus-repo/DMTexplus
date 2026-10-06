package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.ttipprdview", "/app.stocksquimicos.ttipprdview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipprdview extends GXWebObjectStub
{
   public ttipprdview( )
   {
   }

   public ttipprdview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipprdview.class ));
   }

   public ttipprdview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipprdview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipprdview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPPRDView";
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

