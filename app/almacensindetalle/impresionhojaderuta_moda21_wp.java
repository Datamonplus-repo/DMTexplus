package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacensindetalle.impresionhojaderuta_moda21_wp", "/app.almacensindetalle.impresionhojaderuta_moda21_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class impresionhojaderuta_moda21_wp extends GXWebObjectStub
{
   public impresionhojaderuta_moda21_wp( )
   {
   }

   public impresionhojaderuta_moda21_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( impresionhojaderuta_moda21_wp.class ));
   }

   public impresionhojaderuta_moda21_wp( int remoteHandle ,
                                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new impresionhojaderuta_moda21_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new impresionhojaderuta_moda21_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Impresion O.S";
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

