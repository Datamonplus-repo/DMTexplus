package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tprofsawwexportreport", "/app.tprofsawwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprofsawwexportreport extends GXWebObjectStub
{
   public tprofsawwexportreport( )
   {
   }

   public tprofsawwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprofsawwexportreport.class ));
   }

   public tprofsawwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprofsawwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprofsawwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPROFSAWWExport Report";
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

