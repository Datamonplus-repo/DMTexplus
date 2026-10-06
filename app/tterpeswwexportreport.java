package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tterpeswwexportreport", "/app.tterpeswwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tterpeswwexportreport extends GXWebObjectStub
{
   public tterpeswwexportreport( )
   {
   }

   public tterpeswwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tterpeswwexportreport.class ));
   }

   public tterpeswwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tterpeswwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tterpeswwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTERPESWWExport Report";
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

