package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttipmaqwwexportcsv", "/app.ficherosbasicos.ttipmaqwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipmaqwwexportcsv extends GXWebObjectStub
{
   public ttipmaqwwexportcsv( )
   {
   }

   public ttipmaqwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipmaqwwexportcsv.class ));
   }

   public ttipmaqwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipmaqwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipmaqwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPMAQWWExport CSV";
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

