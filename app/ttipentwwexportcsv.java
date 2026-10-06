package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttipentwwexportcsv", "/app.ttipentwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipentwwexportcsv extends GXWebObjectStub
{
   public ttipentwwexportcsv( )
   {
   }

   public ttipentwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipentwwexportcsv.class ));
   }

   public ttipentwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipentwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipentwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPENTWWExport CSV";
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

