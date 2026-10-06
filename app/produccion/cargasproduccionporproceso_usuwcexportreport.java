package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.cargasproduccionporproceso_usuwcexportreport", "/app.produccion.cargasproduccionporproceso_usuwcexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class cargasproduccionporproceso_usuwcexportreport extends GXWebObjectStub
{
   public cargasproduccionporproceso_usuwcexportreport( )
   {
   }

   public cargasproduccionporproceso_usuwcexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( cargasproduccionporproceso_usuwcexportreport.class ));
   }

   public cargasproduccionporproceso_usuwcexportreport( int remoteHandle ,
                                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cargasproduccionporproceso_usuwcexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cargasproduccionporproceso_usuwcexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Producción por Proceso";
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

