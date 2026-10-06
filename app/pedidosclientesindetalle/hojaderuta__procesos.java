package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidosclientesindetalle.hojaderuta__procesos", "/app.pedidosclientesindetalle.hojaderuta__procesos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class hojaderuta__procesos extends GXWebObjectStub
{
   public hojaderuta__procesos( )
   {
   }

   public hojaderuta__procesos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( hojaderuta__procesos.class ));
   }

   public hojaderuta__procesos( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new hojaderuta__procesos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new hojaderuta__procesos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Procesos Produccion";
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

