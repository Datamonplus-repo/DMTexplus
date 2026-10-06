package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttrmwwexportcsv", "/app.ficherosbasicos.ttrmwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrmwwexportcsv extends GXWebObjectStub
{
   public ttrmwwexportcsv( )
   {
   }

   public ttrmwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrmwwexportcsv.class ));
   }

   public ttrmwwexportcsv( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrmwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrmwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTRMWWExport CSV";
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

