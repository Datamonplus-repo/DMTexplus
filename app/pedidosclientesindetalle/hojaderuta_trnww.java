package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidosclientesindetalle.hojaderuta_trnww", "/app.pedidosclientesindetalle.hojaderuta_trnww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class hojaderuta_trnww extends GXWebObjectStub
{
   public hojaderuta_trnww( )
   {
   }

   public hojaderuta_trnww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( hojaderuta_trnww.class ));
   }

   public hojaderuta_trnww( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new hojaderuta_trnww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new hojaderuta_trnww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Mantenimiento Hoja de Ruta";
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

