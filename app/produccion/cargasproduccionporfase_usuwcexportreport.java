package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.cargasproduccionporfase_usuwcexportreport", "/app.produccion.cargasproduccionporfase_usuwcexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class cargasproduccionporfase_usuwcexportreport extends GXWebObjectStub
{
   public cargasproduccionporfase_usuwcexportreport( )
   {
   }

   public cargasproduccionporfase_usuwcexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( cargasproduccionporfase_usuwcexportreport.class ));
   }

   public cargasproduccionporfase_usuwcexportreport( int remoteHandle ,
                                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cargasproduccionporfase_usuwcexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cargasproduccionporfase_usuwcexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Producción por Fase";
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

