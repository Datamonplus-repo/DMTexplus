package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.informeproduccionresumenww", "/app.produccion.informeproduccionresumenww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informeproduccionresumenww extends GXWebObjectStub
{
   public informeproduccionresumenww( )
   {
   }

   public informeproduccionresumenww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informeproduccionresumenww.class ));
   }

   public informeproduccionresumenww( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informeproduccionresumenww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informeproduccionresumenww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Produccion Resumen (DataTime)";
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

