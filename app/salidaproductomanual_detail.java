package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.salidaproductomanual_detail", "/app.salidaproductomanual_detail"})
@jakarta.servlet.annotation.MultipartConfig
public final  class salidaproductomanual_detail extends GXWebObjectStub
{
   public salidaproductomanual_detail( )
   {
   }

   public salidaproductomanual_detail( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( salidaproductomanual_detail.class ));
   }

   public salidaproductomanual_detail( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new salidaproductomanual_detail_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new salidaproductomanual_detail_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Salida Producto Manual Lineas";
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

