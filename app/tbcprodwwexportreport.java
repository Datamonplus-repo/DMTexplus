package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tbcprodwwexportreport", "/app.tbcprodwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tbcprodwwexportreport extends GXWebObjectStub
{
   public tbcprodwwexportreport( )
   {
   }

   public tbcprodwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tbcprodwwexportreport.class ));
   }

   public tbcprodwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbcprodwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tbcprodwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TBCPRODWWExport Report";
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

