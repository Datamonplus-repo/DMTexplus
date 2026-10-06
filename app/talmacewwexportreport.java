package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talmacewwexportreport", "/app.talmacewwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talmacewwexportreport extends GXWebObjectStub
{
   public talmacewwexportreport( )
   {
   }

   public talmacewwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talmacewwexportreport.class ));
   }

   public talmacewwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talmacewwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talmacewwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TAlmace WWExport Report";
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

