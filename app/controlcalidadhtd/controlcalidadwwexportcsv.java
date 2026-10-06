package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.controlcalidadwwexportcsv", "/app.controlcalidadhtd.controlcalidadwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class controlcalidadwwexportcsv extends GXWebObjectStub
{
   public controlcalidadwwexportcsv( )
   {
   }

   public controlcalidadwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( controlcalidadwwexportcsv.class ));
   }

   public controlcalidadwwexportcsv( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new controlcalidadwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new controlcalidadwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Control Calidad WWExport CSV";
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

