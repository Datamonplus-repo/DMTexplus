package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.cargasproduccionporproceso_wc", "/app.produccion.cargasproduccionporproceso_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class cargasproduccionporproceso_wc extends GXWebObjectStub
{
   public cargasproduccionporproceso_wc( )
   {
   }

   public cargasproduccionporproceso_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( cargasproduccionporproceso_wc.class ));
   }

   public cargasproduccionporproceso_wc( int remoteHandle ,
                                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cargasproduccionporproceso_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cargasproduccionporproceso_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Cargas Produccionpor Proceso";
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

