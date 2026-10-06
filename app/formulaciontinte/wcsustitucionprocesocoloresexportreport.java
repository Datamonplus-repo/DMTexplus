package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.wcsustitucionprocesocoloresexportreport", "/app.formulaciontinte.wcsustitucionprocesocoloresexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcsustitucionprocesocoloresexportreport extends GXWebObjectStub
{
   public wcsustitucionprocesocoloresexportreport( )
   {
   }

   public wcsustitucionprocesocoloresexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcsustitucionprocesocoloresexportreport.class ));
   }

   public wcsustitucionprocesocoloresexportreport( int remoteHandle ,
                                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcsustitucionprocesocoloresexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcsustitucionprocesocoloresexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCSustitucion Proceso Colores Export Report";
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

