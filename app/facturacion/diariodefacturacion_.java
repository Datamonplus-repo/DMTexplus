package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.diariodefacturacion_", "/app.facturacion.diariodefacturacion_"})
@jakarta.servlet.annotation.MultipartConfig
public final  class diariodefacturacion_ extends GXWebObjectStub
{
   public diariodefacturacion_( )
   {
   }

   public diariodefacturacion_( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( diariodefacturacion_.class ));
   }

   public diariodefacturacion_( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new diariodefacturacion__impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new diariodefacturacion__impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Diario de Facturacion";
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

