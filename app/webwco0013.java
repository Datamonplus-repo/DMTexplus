package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwco0013", "/app.webwco0013"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwco0013 extends GXWebObjectStub
{
   public webwco0013( )
   {
   }

   public webwco0013( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwco0013.class ));
   }

   public webwco0013( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwco0013_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwco0013_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Realizacion Pedidos";
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

