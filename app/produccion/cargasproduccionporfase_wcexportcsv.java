package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.cargasproduccionporfase_wcexportcsv", "/app.produccion.cargasproduccionporfase_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class cargasproduccionporfase_wcexportcsv extends GXWebObjectStub
{
   public cargasproduccionporfase_wcexportcsv( )
   {
   }

   public cargasproduccionporfase_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( cargasproduccionporfase_wcexportcsv.class ));
   }

   public cargasproduccionporfase_wcexportcsv( int remoteHandle ,
                                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cargasproduccionporfase_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cargasproduccionporfase_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Cargas Produccionpor Fase_WCExport CSV";
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

