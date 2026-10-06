package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.informealbaranesproducciondetallado_wcexportcsv", "/app.informealbaranesproducciondetallado_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informealbaranesproducciondetallado_wcexportcsv extends GXWebObjectStub
{
   public informealbaranesproducciondetallado_wcexportcsv( )
   {
   }

   public informealbaranesproducciondetallado_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informealbaranesproducciondetallado_wcexportcsv.class ));
   }

   public informealbaranesproducciondetallado_wcexportcsv( int remoteHandle ,
                                                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informealbaranesproducciondetallado_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informealbaranesproducciondetallado_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Albaranes Produccion Detallado_WCExport CSV";
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

