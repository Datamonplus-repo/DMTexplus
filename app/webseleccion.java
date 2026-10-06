package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webseleccion", "/app.webseleccion"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webseleccion extends GXWebObjectStub
{
   public webseleccion( )
   {
   }

   public webseleccion( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webseleccion.class ));
   }

   public webseleccion( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webseleccion_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webseleccion_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Seleccionar una opción";
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

