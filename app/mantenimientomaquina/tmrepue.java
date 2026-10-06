package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmrepue", "/app.mantenimientomaquina.tmrepue"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmrepue extends GXWebObjectStub
{
   public tmrepue( )
   {
   }

   public tmrepue( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmrepue.class ));
   }

   public tmrepue( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmrepue_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmrepue_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Respuestos";
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

