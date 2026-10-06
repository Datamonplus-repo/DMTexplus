package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdoctrnwwexportreport", "/app.tdoctrnwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdoctrnwwexportreport extends GXWebObjectStub
{
   public tdoctrnwwexportreport( )
   {
   }

   public tdoctrnwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdoctrnwwexportreport.class ));
   }

   public tdoctrnwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdoctrnwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdoctrnwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TDOCTRNWWExport Report";
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

