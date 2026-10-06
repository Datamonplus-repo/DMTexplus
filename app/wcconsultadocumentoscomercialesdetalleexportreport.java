package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcconsultadocumentoscomercialesdetalleexportreport", "/app.wcconsultadocumentoscomercialesdetalleexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcconsultadocumentoscomercialesdetalleexportreport extends GXWebObjectStub
{
   public wcconsultadocumentoscomercialesdetalleexportreport( )
   {
   }

   public wcconsultadocumentoscomercialesdetalleexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcconsultadocumentoscomercialesdetalleexportreport.class ));
   }

   public wcconsultadocumentoscomercialesdetalleexportreport( int remoteHandle ,
                                                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcconsultadocumentoscomercialesdetalleexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcconsultadocumentoscomercialesdetalleexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Lista Documentos Comerciales - Detalle";
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

