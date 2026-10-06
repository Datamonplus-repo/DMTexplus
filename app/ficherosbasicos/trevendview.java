package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.trevendview", "/app.ficherosbasicos.trevendview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trevendview extends GXWebObjectStub
{
   public trevendview( )
   {
   }

   public trevendview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trevendview.class ));
   }

   public trevendview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trevendview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trevendview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TREVENDView";
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

