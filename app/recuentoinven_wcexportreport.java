package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.recuentoinven_wcexportreport", "/app.recuentoinven_wcexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recuentoinven_wcexportreport extends GXWebObjectStub
{
   public recuentoinven_wcexportreport( )
   {
   }

   public recuentoinven_wcexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recuentoinven_wcexportreport.class ));
   }

   public recuentoinven_wcexportreport( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recuentoinven_wcexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recuentoinven_wcexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Recuento Inven_WCExport Report";
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

