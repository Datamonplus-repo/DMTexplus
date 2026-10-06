package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tprepedwwexportreport", "/app.tprepedwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprepedwwexportreport extends GXWebObjectStub
{
   public tprepedwwexportreport( )
   {
   }

   public tprepedwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprepedwwexportreport.class ));
   }

   public tprepedwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprepedwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprepedwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPREPEDWWExport Report";
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

