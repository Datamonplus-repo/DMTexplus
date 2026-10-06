package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rdevcrumoda21", "/app.rdevcrumoda21"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rdevcrumoda21 extends GXWebObjectStub
{
   public rdevcrumoda21( )
   {
   }

   public rdevcrumoda21( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rdevcrumoda21.class ));
   }

   public rdevcrumoda21( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rdevcrumoda21_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rdevcrumoda21_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "DEVCRUModa21";
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

