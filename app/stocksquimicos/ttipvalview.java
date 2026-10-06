package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.ttipvalview", "/app.stocksquimicos.ttipvalview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipvalview extends GXWebObjectStub
{
   public ttipvalview( )
   {
   }

   public ttipvalview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipvalview.class ));
   }

   public ttipvalview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipvalview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipvalview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPVALView";
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

