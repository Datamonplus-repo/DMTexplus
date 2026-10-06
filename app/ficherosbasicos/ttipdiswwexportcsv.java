package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttipdiswwexportcsv", "/app.ficherosbasicos.ttipdiswwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipdiswwexportcsv extends GXWebObjectStub
{
   public ttipdiswwexportcsv( )
   {
   }

   public ttipdiswwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipdiswwexportcsv.class ));
   }

   public ttipdiswwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipdiswwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipdiswwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPDISWWExport CSV";
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

