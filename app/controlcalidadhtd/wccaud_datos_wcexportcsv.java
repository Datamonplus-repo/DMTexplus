package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.wccaud_datos_wcexportcsv", "/app.controlcalidadhtd.wccaud_datos_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wccaud_datos_wcexportcsv extends GXWebObjectStub
{
   public wccaud_datos_wcexportcsv( )
   {
   }

   public wccaud_datos_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wccaud_datos_wcexportcsv.class ));
   }

   public wccaud_datos_wcexportcsv( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wccaud_datos_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wccaud_datos_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Wccaud_Datos_WCExport CSV";
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

