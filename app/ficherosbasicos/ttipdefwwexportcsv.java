package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttipdefwwexportcsv", "/app.ficherosbasicos.ttipdefwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipdefwwexportcsv extends GXWebObjectStub
{
   public ttipdefwwexportcsv( )
   {
   }

   public ttipdefwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipdefwwexportcsv.class ));
   }

   public ttipdefwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipdefwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipdefwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPDEFWWExport CSV";
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

