package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.pfacta0", "/app.mantenimientomaquina.pfacta0"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pfacta0 extends GXWebObjectStub
{
   public pfacta0( )
   {
   }

   public pfacta0( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pfacta0.class ));
   }

   public pfacta0( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pfacta0_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pfacta0_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consumos x Mes y Sección";
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

