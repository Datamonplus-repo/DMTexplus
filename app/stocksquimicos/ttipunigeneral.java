package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.ttipunigeneral", "/app.stocksquimicos.ttipunigeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipunigeneral extends GXWebObjectStub
{
   public ttipunigeneral( )
   {
   }

   public ttipunigeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipunigeneral.class ));
   }

   public ttipunigeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipunigeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipunigeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPUNIGeneral";
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

