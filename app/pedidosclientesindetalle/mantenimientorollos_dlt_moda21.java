package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidosclientesindetalle.mantenimientorollos_dlt_moda21", "/app.pedidosclientesindetalle.mantenimientorollos_dlt_moda21"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mantenimientorollos_dlt_moda21 extends GXWebObjectStub
{
   public mantenimientorollos_dlt_moda21( )
   {
   }

   public mantenimientorollos_dlt_moda21( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mantenimientorollos_dlt_moda21.class ));
   }

   public mantenimientorollos_dlt_moda21( int remoteHandle ,
                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mantenimientorollos_dlt_moda21_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mantenimientorollos_dlt_moda21_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento Rollos (delete Moda21)";
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

