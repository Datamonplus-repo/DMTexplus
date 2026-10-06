package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwco0006", "/app.webwco0006"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwco0006 extends GXWebObjectStub
{
   public webwco0006( )
   {
   }

   public webwco0006( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwco0006.class ));
   }

   public webwco0006( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwco0006_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwco0006_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Devolucion Compras";
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

