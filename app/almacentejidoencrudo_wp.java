package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacentejidoencrudo_wp", "/app.almacentejidoencrudo_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class almacentejidoencrudo_wp extends GXWebObjectStub
{
   public almacentejidoencrudo_wp( )
   {
   }

   public almacentejidoencrudo_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( almacentejidoencrudo_wp.class ));
   }

   public almacentejidoencrudo_wp( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new almacentejidoencrudo_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new almacentejidoencrudo_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Almacen Tejido en Crudo";
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

