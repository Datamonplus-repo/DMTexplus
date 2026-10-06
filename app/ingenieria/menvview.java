package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ingenieria.menvview", "/app.ingenieria.menvview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class menvview extends GXWebObjectStub
{
   public menvview( )
   {
   }

   public menvview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( menvview.class ));
   }

   public menvview( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new menvview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new menvview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MEnv View";
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

