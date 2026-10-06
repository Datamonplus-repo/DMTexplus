package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidosclientesindetalle.mantenimientorollos", "/app.pedidosclientesindetalle.mantenimientorollos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mantenimientorollos extends GXWebObjectStub
{
   public mantenimientorollos( )
   {
   }

   public mantenimientorollos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mantenimientorollos.class ));
   }

   public mantenimientorollos( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mantenimientorollos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mantenimientorollos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento Rollos";
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

