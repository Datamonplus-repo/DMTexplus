package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tprofsaview", "/app.tprofsaview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprofsaview extends GXWebObjectStub
{
   public tprofsaview( )
   {
   }

   public tprofsaview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprofsaview.class ));
   }

   public tprofsaview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprofsaview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprofsaview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPROFSAView";
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

