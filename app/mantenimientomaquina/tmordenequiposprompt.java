package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmordenequiposprompt", "/app.mantenimientomaquina.tmordenequiposprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmordenequiposprompt extends GXWebObjectStub
{
   public tmordenequiposprompt( )
   {
   }

   public tmordenequiposprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmordenequiposprompt.class ));
   }

   public tmordenequiposprompt( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmordenequiposprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmordenequiposprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Equipos";
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

