package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tbarens", "/app.tbarens"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tbarens extends GXWebObjectStub
{
   public tbarens( )
   {
   }

   public tbarens( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tbarens.class ));
   }

   public tbarens( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbarens_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tbarens_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Ensayos de HDR";
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

