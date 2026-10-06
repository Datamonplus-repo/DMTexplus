package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.ttipdtoview", "/app.stocksquimicos.ttipdtoview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipdtoview extends GXWebObjectStub
{
   public ttipdtoview( )
   {
   }

   public ttipdtoview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipdtoview.class ));
   }

   public ttipdtoview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipdtoview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipdtoview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPDTOView";
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

