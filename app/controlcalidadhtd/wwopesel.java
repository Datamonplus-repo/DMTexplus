package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.wwopesel", "/app.controlcalidadhtd.wwopesel"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wwopesel extends GXWebObjectStub
{
   public wwopesel( )
   {
   }

   public wwopesel( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wwopesel.class ));
   }

   public wwopesel( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wwopesel_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wwopesel_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona MANTENIMIENTO DE OPERARIOS";
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

