package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wpcncolores", "/app.wpcncolores"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wpcncolores extends GXWebObjectStub
{
   public wpcncolores( )
   {
   }

   public wpcncolores( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wpcncolores.class ));
   }

   public wpcncolores( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wpcncolores_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wpcncolores_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Seleccion Colores";
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

