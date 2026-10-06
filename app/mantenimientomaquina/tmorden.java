package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmorden", "/app.mantenimientomaquina.tmorden"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmorden extends GXWebObjectStub
{
   public tmorden( )
   {
   }

   public tmorden( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmorden.class ));
   }

   public tmorden( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmorden_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmorden_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Ordenes de Mantenimiento";
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

