package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.informemermasdetallado_wcexportreport", "/app.informemermasdetallado_wcexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informemermasdetallado_wcexportreport extends GXWebObjectStub
{
   public informemermasdetallado_wcexportreport( )
   {
   }

   public informemermasdetallado_wcexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informemermasdetallado_wcexportreport.class ));
   }

   public informemermasdetallado_wcexportreport( int remoteHandle ,
                                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informemermasdetallado_wcexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informemermasdetallado_wcexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Mermas Detallado_WCExport Report";
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

