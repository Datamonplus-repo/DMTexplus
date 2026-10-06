package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttipprewwexportcsv", "/app.ficherosbasicos.ttipprewwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipprewwexportcsv extends GXWebObjectStub
{
   public ttipprewwexportcsv( )
   {
   }

   public ttipprewwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipprewwexportcsv.class ));
   }

   public ttipprewwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipprewwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipprewwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPPREWWExport CSV";
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

