package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmordrc", "/app.mantenimientomaquina.tmordrc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmordrc extends GXWebObjectStub
{
   public tmordrc( )
   {
   }

   public tmordrc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmordrc.class ));
   }

   public tmordrc( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmordrc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmordrc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Con Repuestos,Orden de Trabajo";
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

