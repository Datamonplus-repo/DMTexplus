package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mensajeconfirmarduplicartarea", "/app.mensajeconfirmarduplicartarea"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mensajeconfirmarduplicartarea extends GXWebObjectStub
{
   public mensajeconfirmarduplicartarea( )
   {
   }

   public mensajeconfirmarduplicartarea( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mensajeconfirmarduplicartarea.class ));
   }

   public mensajeconfirmarduplicartarea( int remoteHandle ,
                                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mensajeconfirmarduplicartarea_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mensajeconfirmarduplicartarea_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mensaje Confirmar Duplicar Tarea";
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

