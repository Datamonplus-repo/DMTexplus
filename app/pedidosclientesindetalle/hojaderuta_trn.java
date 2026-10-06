package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidosclientesindetalle.hojaderuta_trn", "/app.pedidosclientesindetalle.hojaderuta_trn"})
@jakarta.servlet.annotation.MultipartConfig
public final  class hojaderuta_trn extends GXWebObjectStub
{
   public hojaderuta_trn( )
   {
   }

   public hojaderuta_trn( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( hojaderuta_trn.class ));
   }

   public hojaderuta_trn( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new hojaderuta_trn_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new hojaderuta_trn_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento Hoja de Ruta";
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

