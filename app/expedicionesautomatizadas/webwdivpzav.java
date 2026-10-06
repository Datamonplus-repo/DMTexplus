package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.expedicionesautomatizadas.webwdivpzav", "/app.expedicionesautomatizadas.webwdivpzav"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwdivpzav extends GXWebObjectStub
{
   public webwdivpzav( )
   {
   }

   public webwdivpzav( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwdivpzav.class ));
   }

   public webwdivpzav( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwdivpzav_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwdivpzav_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web WDIVPZAV";
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

