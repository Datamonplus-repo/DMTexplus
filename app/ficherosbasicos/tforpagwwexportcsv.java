package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tforpagwwexportcsv", "/app.ficherosbasicos.tforpagwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tforpagwwexportcsv extends GXWebObjectStub
{
   public tforpagwwexportcsv( )
   {
   }

   public tforpagwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tforpagwwexportcsv.class ));
   }

   public tforpagwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tforpagwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tforpagwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TFORPAGWWExport CSV";
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

