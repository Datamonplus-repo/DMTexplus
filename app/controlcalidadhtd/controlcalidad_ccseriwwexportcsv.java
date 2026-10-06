package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.controlcalidad_ccseriwwexportcsv", "/app.controlcalidadhtd.controlcalidad_ccseriwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class controlcalidad_ccseriwwexportcsv extends GXWebObjectStub
{
   public controlcalidad_ccseriwwexportcsv( )
   {
   }

   public controlcalidad_ccseriwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( controlcalidad_ccseriwwexportcsv.class ));
   }

   public controlcalidad_ccseriwwexportcsv( int remoteHandle ,
                                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new controlcalidad_ccseriwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new controlcalidad_ccseriwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Control Calidad_CCSeri WWExport CSV";
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

