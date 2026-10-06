package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.wcsustitucionprocesocoloresexportcsv", "/app.formulaciontinte.wcsustitucionprocesocoloresexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcsustitucionprocesocoloresexportcsv extends GXWebObjectStub
{
   public wcsustitucionprocesocoloresexportcsv( )
   {
   }

   public wcsustitucionprocesocoloresexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcsustitucionprocesocoloresexportcsv.class ));
   }

   public wcsustitucionprocesocoloresexportcsv( int remoteHandle ,
                                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcsustitucionprocesocoloresexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcsustitucionprocesocoloresexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCSustitucion Proceso Colores Export CSV";
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

