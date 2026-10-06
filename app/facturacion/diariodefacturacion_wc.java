package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.diariodefacturacion_wc", "/app.facturacion.diariodefacturacion_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class diariodefacturacion_wc extends GXWebObjectStub
{
   public diariodefacturacion_wc( )
   {
   }

   public diariodefacturacion_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( diariodefacturacion_wc.class ));
   }

   public diariodefacturacion_wc( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new diariodefacturacion_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new diariodefacturacion_wc_impl(context).cleanup();
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

