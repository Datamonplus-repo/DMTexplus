package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.crearinventario_recuento_wcexportcsv", "/app.crearinventario_recuento_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class crearinventario_recuento_wcexportcsv extends GXWebObjectStub
{
   public crearinventario_recuento_wcexportcsv( )
   {
   }

   public crearinventario_recuento_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( crearinventario_recuento_wcexportcsv.class ));
   }

   public crearinventario_recuento_wcexportcsv( int remoteHandle ,
                                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new crearinventario_recuento_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new crearinventario_recuento_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Crear Inventario_recuento_WCExport CSV";
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

