package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.salidaproductomanual_header", "/app.salidaproductomanual_header"})
@jakarta.servlet.annotation.MultipartConfig
public final  class salidaproductomanual_header extends GXWebObjectStub
{
   public salidaproductomanual_header( )
   {
   }

   public salidaproductomanual_header( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( salidaproductomanual_header.class ));
   }

   public salidaproductomanual_header( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new salidaproductomanual_header_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new salidaproductomanual_header_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Salida Producto Manual (Cabecera)";
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

