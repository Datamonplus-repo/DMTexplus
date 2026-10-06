package app.lectoroptico ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.lectoroptico.partesdeproduccionlector_wp", "/app.lectoroptico.partesdeproduccionlector_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class partesdeproduccionlector_wp extends GXWebObjectStub
{
   public partesdeproduccionlector_wp( )
   {
   }

   public partesdeproduccionlector_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( partesdeproduccionlector_wp.class ));
   }

   public partesdeproduccionlector_wp( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new partesdeproduccionlector_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new partesdeproduccionlector_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Partes de Produccion Lector";
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

