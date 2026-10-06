package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmsolicww", "/app.mantenimientomaquina.tmsolicww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmsolicww extends GXWebObjectStub
{
   public tmsolicww( )
   {
   }

   public tmsolicww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmsolicww.class ));
   }

   public tmsolicww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmsolicww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmsolicww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Solicitudes de Mantenimiento";
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

