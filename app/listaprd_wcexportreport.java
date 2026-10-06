package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.listaprd_wcexportreport", "/app.listaprd_wcexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class listaprd_wcexportreport extends GXWebObjectStub
{
   public listaprd_wcexportreport( )
   {
   }

   public listaprd_wcexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( listaprd_wcexportreport.class ));
   }

   public listaprd_wcexportreport( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new listaprd_wcexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new listaprd_wcexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Lista Prd_WCExport Report";
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

