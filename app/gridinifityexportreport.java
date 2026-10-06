package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gridinifityexportreport", "/app.gridinifityexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class gridinifityexportreport extends GXWebObjectStub
{
   public gridinifityexportreport( )
   {
   }

   public gridinifityexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( gridinifityexportreport.class ));
   }

   public gridinifityexportreport( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new gridinifityexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new gridinifityexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Grid Inifity Export Report";
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

