package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidosclientesindetalle.hojaderuta__piezas", "/app.pedidosclientesindetalle.hojaderuta__piezas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class hojaderuta__piezas extends GXWebObjectStub
{
   public hojaderuta__piezas( )
   {
   }

   public hojaderuta__piezas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( hojaderuta__piezas.class ));
   }

   public hojaderuta__piezas( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new hojaderuta__piezas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new hojaderuta__piezas_impl(context).cleanup();
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

