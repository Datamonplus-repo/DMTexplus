package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tprvgenwwexportreport", "/app.tprvgenwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprvgenwwexportreport extends GXWebObjectStub
{
   public tprvgenwwexportreport( )
   {
   }

   public tprvgenwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprvgenwwexportreport.class ));
   }

   public tprvgenwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprvgenwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprvgenwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPRVGENWWExport Report";
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

