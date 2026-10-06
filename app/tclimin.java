package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tclimin", "/app.tclimin"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclimin extends GXWebObjectStub
{
   public tclimin( )
   {
   }

   public tclimin( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclimin.class ));
   }

   public tclimin( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclimin_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclimin_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MINIMOS CLIENTE";
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

