package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tparundwwexportcsv", "/app.ficherosbasicos.tparundwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tparundwwexportcsv extends GXWebObjectStub
{
   public tparundwwexportcsv( )
   {
   }

   public tparundwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tparundwwexportcsv.class ));
   }

   public tparundwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tparundwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tparundwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPARUNDWWExport CSV";
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

