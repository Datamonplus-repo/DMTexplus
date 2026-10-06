package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.cambiodecolorenhojaderuta", "/app.formulaciontinte.cambiodecolorenhojaderuta"})
@jakarta.servlet.annotation.MultipartConfig
public final  class cambiodecolorenhojaderuta extends GXWebObjectStub
{
   public cambiodecolorenhojaderuta( )
   {
   }

   public cambiodecolorenhojaderuta( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( cambiodecolorenhojaderuta.class ));
   }

   public cambiodecolorenhojaderuta( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cambiodecolorenhojaderuta_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cambiodecolorenhojaderuta_impl(context).cleanup();
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

