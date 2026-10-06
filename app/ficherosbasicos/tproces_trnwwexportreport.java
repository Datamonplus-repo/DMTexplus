package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tproces_trnwwexportreport", "/app.ficherosbasicos.tproces_trnwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tproces_trnwwexportreport extends GXWebObjectStub
{
   public tproces_trnwwexportreport( )
   {
   }

   public tproces_trnwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tproces_trnwwexportreport.class ));
   }

   public tproces_trnwwexportreport( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tproces_trnwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tproces_trnwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TProces_TRNWWExport Report";
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

