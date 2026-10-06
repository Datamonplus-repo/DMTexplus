package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tprvgenview", "/app.tprvgenview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprvgenview extends GXWebObjectStub
{
   public tprvgenview( )
   {
   }

   public tprvgenview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprvgenview.class ));
   }

   public tprvgenview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprvgenview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprvgenview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPRVGENView";
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

