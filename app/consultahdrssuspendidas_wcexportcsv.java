package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.consultahdrssuspendidas_wcexportcsv", "/app.consultahdrssuspendidas_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultahdrssuspendidas_wcexportcsv extends GXWebObjectStub
{
   public consultahdrssuspendidas_wcexportcsv( )
   {
   }

   public consultahdrssuspendidas_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultahdrssuspendidas_wcexportcsv.class ));
   }

   public consultahdrssuspendidas_wcexportcsv( int remoteHandle ,
                                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultahdrssuspendidas_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultahdrssuspendidas_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consulta Hdrs Suspendidas_WCExport CSV";
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

