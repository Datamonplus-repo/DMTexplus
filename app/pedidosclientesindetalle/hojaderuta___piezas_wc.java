package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidosclientesindetalle.hojaderuta___piezas_wc", "/app.pedidosclientesindetalle.hojaderuta___piezas_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class hojaderuta___piezas_wc extends GXWebObjectStub
{
   public hojaderuta___piezas_wc( )
   {
   }

   public hojaderuta___piezas_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( hojaderuta___piezas_wc.class ));
   }

   public hojaderuta___piezas_wc( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new hojaderuta___piezas_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new hojaderuta___piezas_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Modificacion";
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

