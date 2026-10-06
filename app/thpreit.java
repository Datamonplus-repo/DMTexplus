package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.thpreit", "/app.thpreit"})
@jakarta.servlet.annotation.MultipartConfig
public final  class thpreit extends GXWebObjectStub
{
   public thpreit( )
   {
   }

   public thpreit( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( thpreit.class ));
   }

   public thpreit( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new thpreit_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new thpreit_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "HISTORICO PRECIOS INTENSIDAD";
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

