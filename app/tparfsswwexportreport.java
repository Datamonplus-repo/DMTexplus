package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tparfsswwexportreport", "/app.tparfsswwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tparfsswwexportreport extends GXWebObjectStub
{
   public tparfsswwexportreport( )
   {
   }

   public tparfsswwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tparfsswwexportreport.class ));
   }

   public tparfsswwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tparfsswwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tparfsswwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPARFSSWWExport Report";
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

