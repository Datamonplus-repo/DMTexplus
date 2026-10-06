package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.trevendwwexportcsv", "/app.ficherosbasicos.trevendwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trevendwwexportcsv extends GXWebObjectStub
{
   public trevendwwexportcsv( )
   {
   }

   public trevendwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trevendwwexportcsv.class ));
   }

   public trevendwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trevendwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trevendwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TREVENDWWExport CSV";
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

