package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ccstksgeneral", "/app.ccstksgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ccstksgeneral extends GXWebObjectStub
{
   public ccstksgeneral( )
   {
   }

   public ccstksgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ccstksgeneral.class ));
   }

   public ccstksgeneral( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ccstksgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ccstksgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CCSTKSGeneral";
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

