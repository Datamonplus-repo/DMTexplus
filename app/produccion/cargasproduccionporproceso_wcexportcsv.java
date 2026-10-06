package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.cargasproduccionporproceso_wcexportcsv", "/app.produccion.cargasproduccionporproceso_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class cargasproduccionporproceso_wcexportcsv extends GXWebObjectStub
{
   public cargasproduccionporproceso_wcexportcsv( )
   {
   }

   public cargasproduccionporproceso_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( cargasproduccionporproceso_wcexportcsv.class ));
   }

   public cargasproduccionporproceso_wcexportcsv( int remoteHandle ,
                                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cargasproduccionporproceso_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cargasproduccionporproceso_wcexportcsv_impl(context).cleanup();
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

