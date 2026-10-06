package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidosclientesindetalle.mantenimientorollos_ancho_gramagen", "/app.pedidosclientesindetalle.mantenimientorollos_ancho_gramagen"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mantenimientorollos_ancho_gramagen extends GXWebObjectStub
{
   public mantenimientorollos_ancho_gramagen( )
   {
   }

   public mantenimientorollos_ancho_gramagen( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mantenimientorollos_ancho_gramagen.class ));
   }

   public mantenimientorollos_ancho_gramagen( int remoteHandle ,
                                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mantenimientorollos_ancho_gramagen_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mantenimientorollos_ancho_gramagen_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento Rollos (Metros_Ancho_gramagen)";
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

