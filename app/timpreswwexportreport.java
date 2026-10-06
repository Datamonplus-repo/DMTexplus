package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.timpreswwexportreport", "/app.timpreswwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class timpreswwexportreport extends GXWebObjectStub
{
   public timpreswwexportreport( )
   {
   }

   public timpreswwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( timpreswwexportreport.class ));
   }

   public timpreswwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new timpreswwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new timpreswwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TIMPRESWWExport Report";
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

