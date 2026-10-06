package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwcnsalmtela", "/app.webwcnsalmtela"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwcnsalmtela extends GXWebObjectStub
{
   public webwcnsalmtela( )
   {
   }

   public webwcnsalmtela( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwcnsalmtela.class ));
   }

   public webwcnsalmtela( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwcnsalmtela_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwcnsalmtela_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Mantenimiento Almacen Entradas Tela (Detail)";
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

