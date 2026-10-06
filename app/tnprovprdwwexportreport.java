package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tnprovprdwwexportreport", "/app.tnprovprdwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnprovprdwwexportreport extends GXWebObjectStub
{
   public tnprovprdwwexportreport( )
   {
   }

   public tnprovprdwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnprovprdwwexportreport.class ));
   }

   public tnprovprdwwexportreport( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnprovprdwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnprovprdwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tn PROVPRDWWExport Report";
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

