package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidosclientesindetalle.hojaderuta___piezas", "/app.pedidosclientesindetalle.hojaderuta___piezas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class hojaderuta___piezas extends GXWebObjectStub
{
   public hojaderuta___piezas( )
   {
   }

   public hojaderuta___piezas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( hojaderuta___piezas.class ));
   }

   public hojaderuta___piezas( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new hojaderuta___piezas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new hojaderuta___piezas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento de Piezas (Hdr)";
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

