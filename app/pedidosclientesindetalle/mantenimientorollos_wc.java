package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidosclientesindetalle.mantenimientorollos_wc", "/app.pedidosclientesindetalle.mantenimientorollos_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mantenimientorollos_wc extends GXWebObjectStub
{
   public mantenimientorollos_wc( )
   {
   }

   public mantenimientorollos_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mantenimientorollos_wc.class ));
   }

   public mantenimientorollos_wc( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mantenimientorollos_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mantenimientorollos_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Rollos";
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

