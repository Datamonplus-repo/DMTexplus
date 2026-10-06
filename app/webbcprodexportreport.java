package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webbcprodexportreport", "/app.webbcprodexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webbcprodexportreport extends GXWebObjectStub
{
   public webbcprodexportreport( )
   {
   }

   public webbcprodexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webbcprodexportreport.class ));
   }

   public webbcprodexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webbcprodexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webbcprodexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web BCPRODExport Report";
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

