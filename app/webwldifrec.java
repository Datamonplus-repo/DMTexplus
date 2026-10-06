package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwldifrec", "/app.webwldifrec"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwldifrec extends GXWebObjectStub
{
   public webwldifrec( )
   {
   }

   public webwldifrec( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwldifrec.class ));
   }

   public webwldifrec( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwldifrec_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwldifrec_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Inventario";
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

