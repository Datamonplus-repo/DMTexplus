package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwcop000", "/app.webwcop000"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwcop000 extends GXWebObjectStub
{
   public webwcop000( )
   {
   }

   public webwcop000( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwcop000.class ));
   }

   public webwcop000( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwcop000_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwcop000_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Orden de Compra";
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

