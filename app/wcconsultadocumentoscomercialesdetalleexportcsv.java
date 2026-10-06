package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcconsultadocumentoscomercialesdetalleexportcsv", "/app.wcconsultadocumentoscomercialesdetalleexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcconsultadocumentoscomercialesdetalleexportcsv extends GXWebObjectStub
{
   public wcconsultadocumentoscomercialesdetalleexportcsv( )
   {
   }

   public wcconsultadocumentoscomercialesdetalleexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcconsultadocumentoscomercialesdetalleexportcsv.class ));
   }

   public wcconsultadocumentoscomercialesdetalleexportcsv( int remoteHandle ,
                                                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcconsultadocumentoscomercialesdetalleexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcconsultadocumentoscomercialesdetalleexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCConsulta Documentos Comerciales Detalle Export CSV";
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

