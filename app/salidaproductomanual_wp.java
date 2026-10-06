package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.salidaproductomanual_wp", "/app.salidaproductomanual_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class salidaproductomanual_wp extends GXWebObjectStub
{
   public salidaproductomanual_wp( )
   {
   }

   public salidaproductomanual_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( salidaproductomanual_wp.class ));
   }

   public salidaproductomanual_wp( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new salidaproductomanual_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new salidaproductomanual_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Salida Producto Manual Lineas";
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

