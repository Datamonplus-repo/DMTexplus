package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttphp", "/app.ttphp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttphp extends GXWebObjectStub
{
   public ttphp( )
   {
   }

   public ttphp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttphp.class ));
   }

   public ttphp( int remoteHandle ,
                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttphp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttphp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TEST PH parameter";
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

