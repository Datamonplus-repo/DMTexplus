package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.wccaud_wcexportcsv", "/app.controlcalidadhtd.wccaud_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wccaud_wcexportcsv extends GXWebObjectStub
{
   public wccaud_wcexportcsv( )
   {
   }

   public wccaud_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wccaud_wcexportcsv.class ));
   }

   public wccaud_wcexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wccaud_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wccaud_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Wccaud_WCExport CSV";
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

