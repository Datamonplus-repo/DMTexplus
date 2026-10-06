package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmordmrwwexportreport", "/app.tmordmrwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmordmrwwexportreport extends GXWebObjectStub
{
   public tmordmrwwexportreport( )
   {
   }

   public tmordmrwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmordmrwwexportreport.class ));
   }

   public tmordmrwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmordmrwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmordmrwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMOrd MRWWExport Report";
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

