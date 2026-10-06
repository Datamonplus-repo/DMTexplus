package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.cambiodecolorenhojaderuta_wp", "/app.cambiodecolorenhojaderuta_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class cambiodecolorenhojaderuta_wp extends GXWebObjectStub
{
   public cambiodecolorenhojaderuta_wp( )
   {
   }

   public cambiodecolorenhojaderuta_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( cambiodecolorenhojaderuta_wp.class ));
   }

   public cambiodecolorenhojaderuta_wp( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cambiodecolorenhojaderuta_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cambiodecolorenhojaderuta_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Cambio de Color en Hojade Ruta";
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

