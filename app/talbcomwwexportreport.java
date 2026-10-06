package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talbcomwwexportreport", "/app.talbcomwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talbcomwwexportreport extends GXWebObjectStub
{
   public talbcomwwexportreport( )
   {
   }

   public talbcomwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talbcomwwexportreport.class ));
   }

   public talbcomwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talbcomwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talbcomwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TALBCOMWWExport Report";
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

