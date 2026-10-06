package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidosclientesindetalle.impresionhdrscvdetalle_wcexportcsv", "/app.pedidosclientesindetalle.impresionhdrscvdetalle_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class impresionhdrscvdetalle_wcexportcsv extends GXWebObjectStub
{
   public impresionhdrscvdetalle_wcexportcsv( )
   {
   }

   public impresionhdrscvdetalle_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( impresionhdrscvdetalle_wcexportcsv.class ));
   }

   public impresionhdrscvdetalle_wcexportcsv( int remoteHandle ,
                                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new impresionhdrscvdetalle_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new impresionhdrscvdetalle_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Impresion HDRs Cv Detalle_WCExport CSV";
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

