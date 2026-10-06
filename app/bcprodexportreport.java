package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.bcprodexportreport", "/app.bcprodexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class bcprodexportreport extends GXWebObjectStub
{
   public bcprodexportreport( )
   {
   }

   public bcprodexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( bcprodexportreport.class ));
   }

   public bcprodexportreport( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new bcprodexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new bcprodexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "BCPRODExport Report";
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

