package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.salidaproductomanual_headerwwexportcsv", "/app.salidaproductomanual_headerwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class salidaproductomanual_headerwwexportcsv extends GXWebObjectStub
{
   public salidaproductomanual_headerwwexportcsv( )
   {
   }

   public salidaproductomanual_headerwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( salidaproductomanual_headerwwexportcsv.class ));
   }

   public salidaproductomanual_headerwwexportcsv( int remoteHandle ,
                                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new salidaproductomanual_headerwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new salidaproductomanual_headerwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Salida Producto Manual_header WWExport CSV";
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

