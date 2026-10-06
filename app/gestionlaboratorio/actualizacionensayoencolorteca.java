package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.actualizacionensayoencolorteca", "/app.gestionlaboratorio.actualizacionensayoencolorteca"})
@jakarta.servlet.annotation.MultipartConfig
public final  class actualizacionensayoencolorteca extends GXWebObjectStub
{
   public actualizacionensayoencolorteca( )
   {
   }

   public actualizacionensayoencolorteca( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( actualizacionensayoencolorteca.class ));
   }

   public actualizacionensayoencolorteca( int remoteHandle ,
                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new actualizacionensayoencolorteca_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new actualizacionensayoencolorteca_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Actualizacion Ensayo en Colorteca";
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

