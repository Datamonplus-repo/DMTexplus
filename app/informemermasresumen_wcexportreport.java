package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.informemermasresumen_wcexportreport", "/app.informemermasresumen_wcexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informemermasresumen_wcexportreport extends GXWebObjectStub
{
   public informemermasresumen_wcexportreport( )
   {
   }

   public informemermasresumen_wcexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informemermasresumen_wcexportreport.class ));
   }

   public informemermasresumen_wcexportreport( int remoteHandle ,
                                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informemermasresumen_wcexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informemermasresumen_wcexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Mermas Resumen_WCExport Report";
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

