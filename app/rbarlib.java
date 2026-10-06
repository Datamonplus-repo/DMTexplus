package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rbarlib", "/app.rbarlib"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rbarlib extends GXWebObjectStub
{
   public rbarlib( )
   {
   }

   public rbarlib( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rbarlib.class ));
   }

   public rbarlib( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rbarlib_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rbarlib_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Code Bar";
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

