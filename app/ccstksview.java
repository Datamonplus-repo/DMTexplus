package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ccstksview", "/app.ccstksview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ccstksview extends GXWebObjectStub
{
   public ccstksview( )
   {
   }

   public ccstksview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ccstksview.class ));
   }

   public ccstksview( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ccstksview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ccstksview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CCSTKSView";
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

