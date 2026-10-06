package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.consultadeproduccion_test", "/app.produccion.consultadeproduccion_test"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultadeproduccion_test extends GXWebObjectStub
{
   public consultadeproduccion_test( )
   {
   }

   public consultadeproduccion_test( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultadeproduccion_test.class ));
   }

   public consultadeproduccion_test( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultadeproduccion_test_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultadeproduccion_test_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Mantenimiento Hoja de Ruta";
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

