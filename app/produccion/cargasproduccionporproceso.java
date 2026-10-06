package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.cargasproduccionporproceso", "/app.produccion.cargasproduccionporproceso"})
@jakarta.servlet.annotation.MultipartConfig
public final  class cargasproduccionporproceso extends GXWebObjectStub
{
   public cargasproduccionporproceso( )
   {
   }

   public cargasproduccionporproceso( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( cargasproduccionporproceso.class ));
   }

   public cargasproduccionporproceso( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cargasproduccionporproceso_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cargasproduccionporproceso_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Cargas Produccionpor Proceso";
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

