package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.expedicionesautomatizadas.webwmhdpzp", "/app.expedicionesautomatizadas.webwmhdpzp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwmhdpzp extends GXWebObjectStub
{
   public webwmhdpzp( )
   {
   }

   public webwmhdpzp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwmhdpzp.class ));
   }

   public webwmhdpzp( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwmhdpzp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwmhdpzp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web WMHDPZP";
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

