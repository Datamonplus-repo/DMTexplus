package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.consultadeproduccion_test_2", "/app.produccion.consultadeproduccion_test_2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultadeproduccion_test_2 extends GXWebObjectStub
{
   public consultadeproduccion_test_2( )
   {
   }

   public consultadeproduccion_test_2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultadeproduccion_test_2.class ));
   }

   public consultadeproduccion_test_2( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultadeproduccion_test_2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultadeproduccion_test_2_impl(context).cleanup();
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

