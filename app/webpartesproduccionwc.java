package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webpartesproduccionwc", "/app.webpartesproduccionwc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webpartesproduccionwc extends GXWebObjectStub
{
   public webpartesproduccionwc( )
   {
   }

   public webpartesproduccionwc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webpartesproduccionwc.class ));
   }

   public webpartesproduccionwc( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webpartesproduccionwc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webpartesproduccionwc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web Partes Produccion WC";
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

