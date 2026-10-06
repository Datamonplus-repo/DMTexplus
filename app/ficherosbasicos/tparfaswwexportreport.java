package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tparfaswwexportreport", "/app.ficherosbasicos.tparfaswwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tparfaswwexportreport extends GXWebObjectStub
{
   public tparfaswwexportreport( )
   {
   }

   public tparfaswwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tparfaswwexportreport.class ));
   }

   public tparfaswwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tparfaswwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tparfaswwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Parametros Fase";
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

