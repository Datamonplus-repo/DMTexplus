package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.thpreat", "/app.thpreat"})
@jakarta.servlet.annotation.MultipartConfig
public final  class thpreat extends GXWebObjectStub
{
   public thpreat( )
   {
   }

   public thpreat( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( thpreat.class ));
   }

   public thpreat( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new thpreat_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new thpreat_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "HISTORICO PRECIOS ARTICULO";
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

