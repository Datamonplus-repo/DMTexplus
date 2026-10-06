package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.tmeivawwexportreport", "/app.facturacion.tmeivawwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmeivawwexportreport extends GXWebObjectStub
{
   public tmeivawwexportreport( )
   {
   }

   public tmeivawwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmeivawwexportreport.class ));
   }

   public tmeivawwexportreport( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmeivawwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmeivawwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMEIVAWWExport Report";
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

