package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmprevetareasprompt", "/app.mantenimientomaquina.tmprevetareasprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmprevetareasprompt extends GXWebObjectStub
{
   public tmprevetareasprompt( )
   {
   }

   public tmprevetareasprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmprevetareasprompt.class ));
   }

   public tmprevetareasprompt( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmprevetareasprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmprevetareasprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Tareas";
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

