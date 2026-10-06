package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.consultadeproduccion_almacentejido", "/app.produccion.consultadeproduccion_almacentejido"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultadeproduccion_almacentejido extends GXWebObjectStub
{
   public consultadeproduccion_almacentejido( )
   {
   }

   public consultadeproduccion_almacentejido( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultadeproduccion_almacentejido.class ));
   }

   public consultadeproduccion_almacentejido( int remoteHandle ,
                                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultadeproduccion_almacentejido_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultadeproduccion_almacentejido_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Detalle Entradas Almacen Tejido";
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

