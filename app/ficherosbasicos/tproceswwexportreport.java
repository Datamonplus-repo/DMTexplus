package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tproceswwexportreport", "/app.ficherosbasicos.tproceswwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tproceswwexportreport extends GXWebObjectStub
{
   public tproceswwexportreport( )
   {
   }

   public tproceswwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tproceswwexportreport.class ));
   }

   public tproceswwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tproceswwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tproceswwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPROCESWWExport Report";
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

