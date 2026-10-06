package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tempreswwexportreport", "/app.tempreswwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tempreswwexportreport extends GXWebObjectStub
{
   public tempreswwexportreport( )
   {
   }

   public tempreswwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tempreswwexportreport.class ));
   }

   public tempreswwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tempreswwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tempreswwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TEMPRESWWExport Report";
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

