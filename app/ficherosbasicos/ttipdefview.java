package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttipdefview", "/app.ficherosbasicos.ttipdefview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipdefview extends GXWebObjectStub
{
   public ttipdefview( )
   {
   }

   public ttipdefview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipdefview.class ));
   }

   public ttipdefview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipdefview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipdefview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPDEFView";
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

