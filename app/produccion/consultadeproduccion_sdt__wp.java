package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.consultadeproduccion_sdt__wp", "/app.produccion.consultadeproduccion_sdt__wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultadeproduccion_sdt__wp extends GXWebObjectStub
{
   public consultadeproduccion_sdt__wp( )
   {
   }

   public consultadeproduccion_sdt__wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultadeproduccion_sdt__wp.class ));
   }

   public consultadeproduccion_sdt__wp( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultadeproduccion_sdt__wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultadeproduccion_sdt__wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consulta de Produccion";
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

