package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.cambiodecolorenhojaderuta_2", "/app.formulaciontinte.cambiodecolorenhojaderuta_2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class cambiodecolorenhojaderuta_2 extends GXWebObjectStub
{
   public cambiodecolorenhojaderuta_2( )
   {
   }

   public cambiodecolorenhojaderuta_2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( cambiodecolorenhojaderuta_2.class ));
   }

   public cambiodecolorenhojaderuta_2( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cambiodecolorenhojaderuta_2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cambiodecolorenhojaderuta_2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Cambiode Color en Hoja de Ruta";
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

