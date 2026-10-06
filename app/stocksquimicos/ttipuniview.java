package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.ttipuniview", "/app.stocksquimicos.ttipuniview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipuniview extends GXWebObjectStub
{
   public ttipuniview( )
   {
   }

   public ttipuniview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipuniview.class ));
   }

   public ttipuniview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipuniview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipuniview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPUNIView";
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

