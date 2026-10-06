package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talbdetview", "/app.talbdetview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talbdetview extends GXWebObjectStub
{
   public talbdetview( )
   {
   }

   public talbdetview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talbdetview.class ));
   }

   public talbdetview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talbdetview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talbdetview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TALBDETView";
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

