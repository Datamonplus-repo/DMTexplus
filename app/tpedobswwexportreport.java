package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpedobswwexportreport", "/app.tpedobswwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpedobswwexportreport extends GXWebObjectStub
{
   public tpedobswwexportreport( )
   {
   }

   public tpedobswwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpedobswwexportreport.class ));
   }

   public tpedobswwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpedobswwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpedobswwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPEDOBSWWExport Report";
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

