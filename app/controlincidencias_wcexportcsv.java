package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlincidencias_wcexportcsv", "/app.controlincidencias_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class controlincidencias_wcexportcsv extends GXWebObjectStub
{
   public controlincidencias_wcexportcsv( )
   {
   }

   public controlincidencias_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( controlincidencias_wcexportcsv.class ));
   }

   public controlincidencias_wcexportcsv( int remoteHandle ,
                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new controlincidencias_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new controlincidencias_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Control Incidencias_WCExport CSV";
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

