package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wc_repuestocompatibleexportreport", "/app.wc_repuestocompatibleexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wc_repuestocompatibleexportreport extends GXWebObjectStub
{
   public wc_repuestocompatibleexportreport( )
   {
   }

   public wc_repuestocompatibleexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wc_repuestocompatibleexportreport.class ));
   }

   public wc_repuestocompatibleexportreport( int remoteHandle ,
                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wc_repuestocompatibleexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wc_repuestocompatibleexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Lista de repuestos compatibles";
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

