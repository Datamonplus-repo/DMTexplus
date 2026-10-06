package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ingenieria.menvwwexportreport", "/app.ingenieria.menvwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class menvwwexportreport extends GXWebObjectStub
{
   public menvwwexportreport( )
   {
   }

   public menvwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( menvwwexportreport.class ));
   }

   public menvwwexportreport( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new menvwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new menvwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MEnv WWExport Report";
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

