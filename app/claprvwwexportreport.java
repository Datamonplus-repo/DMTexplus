package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.claprvwwexportreport", "/app.claprvwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class claprvwwexportreport extends GXWebObjectStub
{
   public claprvwwexportreport( )
   {
   }

   public claprvwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( claprvwwexportreport.class ));
   }

   public claprvwwexportreport( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new claprvwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new claprvwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CLAPRVWWExport Report";
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

