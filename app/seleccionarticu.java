package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.seleccionarticu", "/app.seleccionarticu"})
@jakarta.servlet.annotation.MultipartConfig
public final  class seleccionarticu extends GXWebObjectStub
{
   public seleccionarticu( )
   {
   }

   public seleccionarticu( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( seleccionarticu.class ));
   }

   public seleccionarticu( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new seleccionarticu_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new seleccionarticu_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Seleccion Tabla ARTICU";
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

