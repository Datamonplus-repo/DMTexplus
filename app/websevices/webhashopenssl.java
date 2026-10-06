package app.websevices ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.websevices.webhashopenssl", "/app.websevices.webhashopenssl"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webhashopenssl extends GXWebObjectStub
{
   public webhashopenssl( )
   {
   }

   public webhashopenssl( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webhashopenssl.class ));
   }

   public webhashopenssl( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webhashopenssl_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webhashopenssl_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web Hash OPENSSL";
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

