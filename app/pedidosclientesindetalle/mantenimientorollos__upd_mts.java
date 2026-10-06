package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidosclientesindetalle.mantenimientorollos__upd_mts", "/app.pedidosclientesindetalle.mantenimientorollos__upd_mts"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mantenimientorollos__upd_mts extends GXWebObjectStub
{
   public mantenimientorollos__upd_mts( )
   {
   }

   public mantenimientorollos__upd_mts( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mantenimientorollos__upd_mts.class ));
   }

   public mantenimientorollos__upd_mts( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mantenimientorollos__upd_mts_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mantenimientorollos__upd_mts_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento Rollos (Modificacion Mts, KIlos)";
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

