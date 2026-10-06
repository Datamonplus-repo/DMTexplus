package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.consultadeproduccion__wp2", "/app.produccion.consultadeproduccion__wp2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultadeproduccion__wp2 extends GXWebObjectStub
{
   public consultadeproduccion__wp2( )
   {
   }

   public consultadeproduccion__wp2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultadeproduccion__wp2.class ));
   }

   public consultadeproduccion__wp2( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultadeproduccion__wp2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultadeproduccion__wp2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consultade Produccion__WP2";
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

