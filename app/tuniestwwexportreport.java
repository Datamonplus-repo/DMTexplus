package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tuniestwwexportreport", "/app.tuniestwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tuniestwwexportreport extends GXWebObjectStub
{
   public tuniestwwexportreport( )
   {
   }

   public tuniestwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tuniestwwexportreport.class ));
   }

   public tuniestwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tuniestwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tuniestwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TUNIESTWWExport Report";
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

