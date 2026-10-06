package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.tmeivawwexportcsv", "/app.facturacion.tmeivawwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmeivawwexportcsv extends GXWebObjectStub
{
   public tmeivawwexportcsv( )
   {
   }

   public tmeivawwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmeivawwexportcsv.class ));
   }

   public tmeivawwexportcsv( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmeivawwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmeivawwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMEIVAWWExport CSV";
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

