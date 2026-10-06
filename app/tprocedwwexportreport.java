package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tprocedwwexportreport", "/app.tprocedwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprocedwwexportreport extends GXWebObjectStub
{
   public tprocedwwexportreport( )
   {
   }

   public tprocedwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprocedwwexportreport.class ));
   }

   public tprocedwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprocedwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprocedwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPROCEDWWExport Report";
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

