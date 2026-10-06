package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientodehdrs_wcexportcsv", "/app.mantenimientodehdrs_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mantenimientodehdrs_wcexportcsv extends GXWebObjectStub
{
   public mantenimientodehdrs_wcexportcsv( )
   {
   }

   public mantenimientodehdrs_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mantenimientodehdrs_wcexportcsv.class ));
   }

   public mantenimientodehdrs_wcexportcsv( int remoteHandle ,
                                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mantenimientodehdrs_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mantenimientodehdrs_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimientode HDRs_WCExport CSV";
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

