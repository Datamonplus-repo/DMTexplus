package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.controlcalidad_ccdefwwexportcsv", "/app.controlcalidadhtd.controlcalidad_ccdefwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class controlcalidad_ccdefwwexportcsv extends GXWebObjectStub
{
   public controlcalidad_ccdefwwexportcsv( )
   {
   }

   public controlcalidad_ccdefwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( controlcalidad_ccdefwwexportcsv.class ));
   }

   public controlcalidad_ccdefwwexportcsv( int remoteHandle ,
                                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new controlcalidad_ccdefwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new controlcalidad_ccdefwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Control Calidad_CCDEFWWExport CSV";
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

