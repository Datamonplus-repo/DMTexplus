package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tdivisaww", "/app.ficherosbasicos.tdivisaww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdivisaww extends GXWebObjectStub
{
   public tdivisaww( )
   {
   }

   public tdivisaww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdivisaww.class ));
   }

   public tdivisaww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdivisaww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdivisaww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " DIVISAS";
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

