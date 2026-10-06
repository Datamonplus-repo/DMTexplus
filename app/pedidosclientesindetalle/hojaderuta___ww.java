package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidosclientesindetalle.hojaderuta___ww", "/app.pedidosclientesindetalle.hojaderuta___ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class hojaderuta___ww extends GXWebObjectStub
{
   public hojaderuta___ww( )
   {
   }

   public hojaderuta___ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( hojaderuta___ww.class ));
   }

   public hojaderuta___ww( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new hojaderuta___ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new hojaderuta___ww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Mantenimiento Hoja de Ruta v02";
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

