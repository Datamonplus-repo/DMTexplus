package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tobsest", "/app.tobsest"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tobsest extends GXWebObjectStub
{
   public tobsest( )
   {
   }

   public tobsest( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tobsest.class ));
   }

   public tobsest( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tobsest_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tobsest_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "obsest";
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

