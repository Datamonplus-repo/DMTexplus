package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttipcauwwexportcsv", "/app.ficherosbasicos.ttipcauwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipcauwwexportcsv extends GXWebObjectStub
{
   public ttipcauwwexportcsv( )
   {
   }

   public ttipcauwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipcauwwexportcsv.class ));
   }

   public ttipcauwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipcauwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipcauwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPCAUWWExport CSV";
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

