package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tzongeowwexportcsv", "/app.ficherosbasicos.tzongeowwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tzongeowwexportcsv extends GXWebObjectStub
{
   public tzongeowwexportcsv( )
   {
   }

   public tzongeowwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tzongeowwexportcsv.class ));
   }

   public tzongeowwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tzongeowwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tzongeowwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TZONGEOWWExport CSV";
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

