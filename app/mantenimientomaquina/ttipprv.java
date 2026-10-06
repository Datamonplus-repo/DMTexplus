package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.ttipprv", "/app.mantenimientomaquina.ttipprv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipprv extends GXWebObjectStub
{
   public ttipprv( )
   {
   }

   public ttipprv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipprv.class ));
   }

   public ttipprv( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipprv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipprv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TIPOS DE PREVENTIVO";
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

