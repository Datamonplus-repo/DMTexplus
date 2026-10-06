package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.wc_repuestocompatibleexportcsv", "/app.mantenimientomaquina.wc_repuestocompatibleexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wc_repuestocompatibleexportcsv extends GXWebObjectStub
{
   public wc_repuestocompatibleexportcsv( )
   {
   }

   public wc_repuestocompatibleexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wc_repuestocompatibleexportcsv.class ));
   }

   public wc_repuestocompatibleexportcsv( int remoteHandle ,
                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wc_repuestocompatibleexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wc_repuestocompatibleexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WC_Repuesto Compatible Export CSV";
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

