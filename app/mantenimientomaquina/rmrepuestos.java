package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.rmrepuestos", "/app.mantenimientomaquina.rmrepuestos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rmrepuestos extends GXWebObjectStub
{
   public rmrepuestos( )
   {
   }

   public rmrepuestos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rmrepuestos.class ));
   }

   public rmrepuestos( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rmrepuestos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rmrepuestos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Repuestos de Mantenimiento";
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

