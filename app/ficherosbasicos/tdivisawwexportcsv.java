package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tdivisawwexportcsv", "/app.ficherosbasicos.tdivisawwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdivisawwexportcsv extends GXWebObjectStub
{
   public tdivisawwexportcsv( )
   {
   }

   public tdivisawwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdivisawwexportcsv.class ));
   }

   public tdivisawwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdivisawwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdivisawwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TDIVISAWWExport CSV";
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

