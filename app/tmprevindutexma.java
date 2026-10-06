package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmprevindutexma", "/app.tmprevindutexma"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmprevindutexma extends GXWebObjectStub
{
   public tmprevindutexma( )
   {
   }

   public tmprevindutexma( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmprevindutexma.class ));
   }

   public tmprevindutexma( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmprevindutexma_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmprevindutexma_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MPrev Indutexma";
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

