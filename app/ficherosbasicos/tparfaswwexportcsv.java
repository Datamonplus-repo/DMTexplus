package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tparfaswwexportcsv", "/app.ficherosbasicos.tparfaswwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tparfaswwexportcsv extends GXWebObjectStub
{
   public tparfaswwexportcsv( )
   {
   }

   public tparfaswwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tparfaswwexportcsv.class ));
   }

   public tparfaswwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tparfaswwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tparfaswwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPARFASWWExport CSV";
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

