package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tgrdtipwwexportreport", "/app.ficherosbasicos.tgrdtipwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tgrdtipwwexportreport extends GXWebObjectStub
{
   public tgrdtipwwexportreport( )
   {
   }

   public tgrdtipwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tgrdtipwwexportreport.class ));
   }

   public tgrdtipwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tgrdtipwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tgrdtipwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TGRDTIPWWExport Report";
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

