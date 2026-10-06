package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.consumoprdquimicos_wcexportreport", "/app.consumoprdquimicos_wcexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consumoprdquimicos_wcexportreport extends GXWebObjectStub
{
   public consumoprdquimicos_wcexportreport( )
   {
   }

   public consumoprdquimicos_wcexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consumoprdquimicos_wcexportreport.class ));
   }

   public consumoprdquimicos_wcexportreport( int remoteHandle ,
                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consumoprdquimicos_wcexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consumoprdquimicos_wcexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consumo Prd Quimicos_WCExport Report";
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

