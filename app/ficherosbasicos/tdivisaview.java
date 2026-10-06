package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tdivisaview", "/app.ficherosbasicos.tdivisaview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdivisaview extends GXWebObjectStub
{
   public tdivisaview( )
   {
   }

   public tdivisaview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdivisaview.class ));
   }

   public tdivisaview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdivisaview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdivisaview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TDIVISAView";
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

