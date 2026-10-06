package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.wccest_wcexportcsv", "/app.controlcalidadhtd.wccest_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wccest_wcexportcsv extends GXWebObjectStub
{
   public wccest_wcexportcsv( )
   {
   }

   public wccest_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wccest_wcexportcsv.class ));
   }

   public wccest_wcexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wccest_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wccest_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Wccest_WCExport CSV";
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

