package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tparfasdisparwc", "/app.ficherosbasicos.tparfasdisparwc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tparfasdisparwc extends GXWebObjectStub
{
   public tparfasdisparwc( )
   {
   }

   public tparfasdisparwc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tparfasdisparwc.class ));
   }

   public tparfasdisparwc( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tparfasdisparwc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tparfasdisparwc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPARFASDis Par WC";
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

