package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.expedicionesautomatizadas.webwparpzi", "/app.expedicionesautomatizadas.webwparpzi"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwparpzi extends GXWebObjectStub
{
   public webwparpzi( )
   {
   }

   public webwparpzi( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwparpzi.class ));
   }

   public webwparpzi( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwparpzi_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwparpzi_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web WPARPZI";
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

