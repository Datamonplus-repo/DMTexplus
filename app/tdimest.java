package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdimest", "/app.tdimest"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdimest extends GXWebObjectStub
{
   public tdimest( )
   {
   }

   public tdimest( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdimest.class ));
   }

   public tdimest( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdimest_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdimest_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TEST ESTABILIDAD DIMENSIONAL";
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

