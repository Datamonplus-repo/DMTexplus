package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttipurg", "/app.ttipurg"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipurg extends GXWebObjectStub
{
   public ttipurg( )
   {
   }

   public ttipurg( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipurg.class ));
   }

   public ttipurg( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipurg_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipurg_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TIPOS DE";
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

