package app.websevices ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.websevices.pruebasopenssl", "/app.websevices.pruebasopenssl"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pruebasopenssl extends GXWebObjectStub
{
   public pruebasopenssl( )
   {
   }

   public pruebasopenssl( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pruebasopenssl.class ));
   }

   public pruebasopenssl( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pruebasopenssl_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pruebasopenssl_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Pruebas OPENSSL";
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

