package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.consultadeproduccion_partesproduccion", "/app.produccion.consultadeproduccion_partesproduccion"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultadeproduccion_partesproduccion extends GXWebObjectStub
{
   public consultadeproduccion_partesproduccion( )
   {
   }

   public consultadeproduccion_partesproduccion( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultadeproduccion_partesproduccion.class ));
   }

   public consultadeproduccion_partesproduccion( int remoteHandle ,
                                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultadeproduccion_partesproduccion_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultadeproduccion_partesproduccion_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Parte Produccion";
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

