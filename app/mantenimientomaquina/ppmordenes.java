package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.ppmordenes", "/app.mantenimientomaquina.ppmordenes"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ppmordenes extends GXWebObjectStub
{
   public ppmordenes( )
   {
   }

   public ppmordenes( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ppmordenes.class ));
   }

   public ppmordenes( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ppmordenes_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ppmordenes_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Orden";
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

